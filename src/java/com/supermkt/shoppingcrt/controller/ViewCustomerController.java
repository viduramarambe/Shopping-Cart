/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.controller;

import com.supermkt.shoppingcrt.dto.CustomerDTO;
import com.supermkt.shoppingcrt.service.impl.CustomerServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vidura Marambe
 */
@WebServlet(name = "ViewCustomerController", urlPatterns = {"/ViewCustomerController"})
public class ViewCustomerController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print("<style>");
            out.print("table,th,td{border: solid black;border-collapse: collapse}");
            out.print("</style>");
            out.print("<table>");
            out.print("<tr>");
            out.print("<td>");
            out.print("CustomerID");
            out.print("</td>");
            out.print("<td>");
            out.print("Username");
            out.print("</td>");
            out.print("<td>");
            out.print("Password");
            out.print("</td>");
            out.print("<td>");
            out.print("Mobile");
            out.print("</td>");
            out.print("</tr>");
            List<CustomerDTO> readCustomers= new CustomerServiceImpl().showCustomers();
            for (CustomerDTO readCustomer : readCustomers) {
                out.print("<tr>");
                out.print("<td>");
                out.print(readCustomer.getCustomerId());
                out.print("</td>");
                out.print("<td>");
                out.print(readCustomer.getUserName());
                out.print("</td>");
                out.print("<td>");
                out.print(readCustomer.getPassword());
                out.print("</td>");
                out.print("<td>");
                out.print(readCustomer.getMobile());
                out.print("</td>");
            }
            out.print("</table>");
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
