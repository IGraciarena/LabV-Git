package com.company.dao.mysql;

import com.company.dao.iHumanDao;
import com.company.domain.Human;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HumanMysqlDao implements iHumanDao {

    Connection connection;

    public HumanMysqlDao(Connection connection) {
        this.connection=connection;
    }

    @Override
    public Human getByName(Human value) {
        String query = "select * from humans where name=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,value.getName());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(Human value) throws SQLException {
        String query = "insert into humans values(null,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1,value.getName());
        ps.setInt(2,value.getAge());
        ps.setInt(3,value.getWeight());
        ps.execute();
    }

    @Override
    public void remove(Human value) {
        String query = "delete from humans where name = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,value.getName());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            e.getSQLState();
        }
    }

    @Override
    public Human update(Human value) {
        String query = "update humans set name=? ,age=?,weight=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,value.getName());
            ps.setInt(2,value.getAge());
            ps.setInt(3,value.getWeight());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            e.getSQLState();
        }
        return null;
    }

    @Override
    public void remove(Integer id) {
        String query = "delete from humans where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(0,id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Human getById(Integer id) {
        String query ="select * from humans where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(0,id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            e.getSQLState();
        }
        return null;
    }

    @Override
    public List<Human> getAll() {
        String query = "select * from humans";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


//        @Override
//        public User getByUserName(String username, String password) {
//            try {
//                PreparedStatement ps = connection.prepareStatement("select * from users u where u.username = ? and u.pwd = ?");
//                ps.setString(1, username);
//                ps.setString(2, password);
//                ResultSet rs = ps.executeQuery();
//
//                if (rs.next()) {
//                    return new User(rs.getInt("id_user"),
//                            rs.getString("name"),
//                            rs.getString("surname"),
//                            rs.getString("username"),
//                            rs.getString("pwd"),
//                            null);
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException("Error al obtener datos de la base de datos", e);
//            }
//            return null;//??????????????
//        }
}
