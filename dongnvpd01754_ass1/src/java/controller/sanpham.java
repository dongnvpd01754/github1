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
@WebServlet(name = "sanpham", urlPatterns = {"/sanpham"})
public class sanpham extends HttpServlet {

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
            String sql = "insert into SANPHAM  values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String maSP = request.getParameter("1");
            String tenSP = request.getParameter("2");
            String mota = request.getParameter("3");
            String soluong = request.getParameter("4");
            String dongia = request.getParameter("5");
            String nhasanxuat = request.getParameter("6");
            String maloai = request.getParameter("7");

            ps.setString(1, maSP);
            ps.setString(2, tenSP);
            ps.setString(3, mota);
            ps.setString(4, soluong);
            ps.setString(5, dongia);
            ps.setString(6, nhasanxuat);
            ps.setString(7, maloai);
            ps.executeUpdate();
            PrintWriter out = response.getWriter();
            out.print("<h1> thêm sản phẩm thành công.</h1>");
            out.print("<a href='trangchu.jsp'> trở lại trang chủ</a>");

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("<h1>thêm sản phẩm thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'> bạn đã thêm sản phẩm này rồi</h3>");
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
