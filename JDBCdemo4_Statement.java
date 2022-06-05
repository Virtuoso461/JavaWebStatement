package com.itheima.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo4_Statement {

    @Test
        public void testDML() throws SQLException {
        //1.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        String url = "jdbc:mysql:///test";
        String username = "root";
        String password = "13579";
        Connection con = DriverManager.getConnection(url, username, password);
        //3.定义SQL语句
        String sql = "drop database db2";

        //4.获取SQL对象
        Statement stmt = con.createStatement();

        //5.执行SQL
        int count = stmt.executeUpdate(sql);

        //6.处理返回结果
//        if (count > 0 ) {
//            System.out.println("修改成功");
//        } else {
//            System.out.println("修改失败");
//        }
        System.out.println(count);
        //7.释放资源
        stmt.close();
        con.close();
    }
}
