/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Product;

/**
 *
 * @author dell
 */
public class ConnecDB {

    Connection con;
    String dbname;
    String user;
    String pass;

    public ConnecDB(String dbname, String user, String pass) {
        this.dbname = dbname;
        this.user = user;
        this.pass = pass;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://DONG-PC:1433;databaseName=QLBANHANG;user=dongnvpd01754;password=123;");//sqlServer

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int login(String user, String pass) {//trả về 0 khi login sai , 1 khi admin, 2 khi khach hang
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from TAIKHOAN where tendangnhap='" + user + "'and matkhau='" + pass + "'");
            if (rs.next()) {
                if (rs.getString(3).equals("admin"))//kiem tra vai tro
                {
                    return 1; // admin
                } else {
                    return 2; // khach hang 
                }
            } else {
                return 0;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    public int insertProduct(Product obj) {
        try {
            Statement st = con.createStatement();
            int i = st.executeUpdate("insert into SANPHAM values('" + obj.getMaSp() + "','" + obj.getTenSP() + "','" + obj.getMota() + "','" + obj.getSoluong() + "','" + obj.getDongia() + "','" + obj.getHinhanh() + "','" + obj.getNhaSanxuat() + "','" + obj.getMaloai() + "')");
            st.close();
            return i;

        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }

    }

}
