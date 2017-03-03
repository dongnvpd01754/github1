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
@WebServlet(name = "danhky", urlPatterns = {"/danhky"})
public class danhky extends HttpServlet {

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
            String sql = "insert into TAIKHOAN  values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String tendangnhap = request.getParameter("tendangnhap");
            String matkhau = request.getParameter("matkhau");
            String hoten = request.getParameter("hoten");
            String vaitro = request.getParameter("vaitro");
            String diachi = request.getParameter("diachi");
            String soDT = request.getParameter("sdt");
            String email = request.getParameter("email");

            ps.setString(1, tendangnhap);
            ps.setString(2, matkhau);
            ps.setString(3, vaitro);
            ps.setString(4, hoten);
            ps.setString(5, diachi);
            ps.setString(6, soDT);
            ps.setString(7, email);
            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.print("<h1>bạn đã đăng ký thành công tài khoản: " + tendangnhap + "</h1>");
            out.print("<a href='trangchu.jsp'> tro lai trang chu</a>");

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'>Sai thông tin hoặc tên đăng nhập đã tồn tại.</h3>");
            out.println("<a href='trangchu.jsp'>Trở lại trang chủ </a>");
            out.println("<p><a href='dangki.jsp'>Trở lại trang đăng ký </a1></p>");

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
