/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(name = "Donhang", urlPatterns = {"/Donhang"})
public class Donhang extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://DONG-PC:1433;databaseName=QLBANHANG;user=dongnvpd01754;password=123;");
            String sql = "insert into DONHANG  values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String madonhang = request.getParameter("madonhang");
            String makhachhang = request.getParameter("makhachhang");
            String ngaydat = request.getParameter("ngaydat");
            String trangthai = request.getParameter("trangthai");

            ps.setString(1, madonhang);
            ps.setString(2, makhachhang);
            ps.setString(3, ngaydat);
            ps.setString(4, trangthai);
            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.print("<h1>đăng ký thành công.</h1>");
            out.print("<a href='trangchu.jsp'> trở lại trang chủ</a>");

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'>bạn đã đạt hàng cho sản phẩn này rồi</h3>");
            out.println("<a href='trangchu.jsp'>Trở lại trang chủ </a>");
            out.println("<p><a href='sanpham.jsp'>Trở lại trang sản phẩm </a1></p>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
