package cn.itcast.travel.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMysql {
    private String driver;
    private String url;
    private String username;
    private String password;
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public TestMysql() {
        driver="com.mysql.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/travel";
        username="root";
        password="root";
    }
    private Connection getConnection(){
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }


    public static void main(String[] args){
        TestMysql d=new TestMysql();
        System.out.println(d.getConnection());
    }

}





