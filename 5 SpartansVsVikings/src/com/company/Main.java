package com.company;
import com.company.dao.iHumanDao;
import com.company.dao.mysql.HumanMysqlDao;
import com.company.dao.mysql.MysqlPersistance;
import com.company.domain.Human;
import com.company.domain.Spartan;
import com.company.domain.SpartanDrinkImp;
import com.company.domain.Viking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.company.dao.mysql.MysqlUtils.*;

public class Main {

    // SET GLOBAL time_zone =  '-3:00'; en el workbench o DBeaver


//TODO ver la forma de meter un tipo tabla en la base de datos y agregar el campo tipo para vikingo y espartano
// con los integers de resistencias despues ver la forma de agregar al sort el tipo de humano y sacar los dos primeros

    public static void main(String[] args) {
//        MysqlPersistance.getInstance();
        Human s1 = new Spartan(null,"Ivan",25,63);
        Human s11 = new Spartan(null,"Jorge",24,70);
        Human s111 = new Spartan(null,"IvanLopez",19,75);
        Human s1111 = new Spartan(null,"Fede",20,90);
        Human v1 = new Viking(null,"Javier",22,102);
        Human v11 = new Viking(null,"Jose",40,69);
        Human v111 = new Viking(null,"Ramiro",35,80);
        Human v1111 = new Viking(null,"Carlos",18,60);

        try {

            Class.forName(DATABASE_DRIVER).newInstance();
            // creating the connection...
            Connection conn = null;
            conn =  DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            System.out.println("conectado correctamente");


            HumanMysqlDao humanMysqlDao = new HumanMysqlDao(conn);
            humanMysqlDao.add(s11);

        } catch (SQLException e){
            System.out.println("no se pudo conectar a la base de datos");
            System.out.println("SQL State : "+e.getSQLState());
            System.out.println("message : "+e.getMessage());
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Human> humans=new ArrayList<>();
        s1.run();
        humans.add(s1);
        

        //s1.setiDrink(new SpartanDrinkImp());

    }
}
