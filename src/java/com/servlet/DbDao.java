package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDao {

    public Connection conn;
    public String driver;
    public String url;
    public String username;
    public String pass;

    public DbDao() {
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public DbDao(String driver, String url, String username, String pass) throws ClassNotFoundException, SQLException {
        // this.conn=conn;
        this.driver = driver;
        this.pass = pass;
        this.username = username;
        this.url = url;
//        Class.forName(driver);
//        Statement stmt = conn.createStatement();
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            Class.forName(this.driver);
            conn = DriverManager.getConnection(url, username, pass);

        }

        return conn;
    }

    public boolean insert(String sql,Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        for(int i=0;i<args.length;i++)
        {
            pstmt.setObject(i+1,args[i]);
        }
        
        if(pstmt.executeUpdate()!=1)
        {
            return false;
        }
        return true;

    }

    public ResultSet query(String sql,Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement pstmt=getConnection().prepareStatement(sql);
        for(int i=0;i<args.length;i++)
        {
            pstmt.setObject(i+1,args[i]);
        }
        return pstmt.executeQuery();
        
    }

    public void modify(String sql,Object... args) throws SQLException, ClassNotFoundException {
        try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            for(int i=0;i<args.length;i++)
            {
                pstmt.setObject(i+1, args[i]);
            }
            pstmt.executeUpdate();
        }

    }

    public void close() throws SQLException {
        if(conn!=null && !conn.isClosed())
        {
            conn.close();
        }
    }

}
