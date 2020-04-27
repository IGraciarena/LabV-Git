package com.company.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.company.dao.mysql.MysqlUtils.*;

public class MysqlPersistance {
    Connection connection;

    static MysqlPersistance instance;

    public static MysqlPersistance getInstance(){
        if (instance==null){
            instance = new MysqlPersistance();
        }
        return instance;
    }
    private MysqlPersistance(){
        try {
            connection =  DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
            System.out.println("conectado correctamente");
        } catch (SQLException e){
            System.out.println("no se pudo conectar a la base de datos");
            System.out.println("SQL State : "+e.getSQLState());
            System.out.println("message : "+e.getMessage());
        }
    }
}
