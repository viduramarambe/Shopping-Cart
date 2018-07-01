/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.controller;

import com.supermkt.shoppingcrt.dto.ItemDTO;
import com.supermkt.shoppingcrt.service.impl.ItemServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vidura Marambe
 */
@WebServlet(name = "BuyItemController", urlPatterns = {"/BuyItemController"})
public class BuyItemController extends HttpServlet {
    
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
            HttpSession session = request.getSession();
            String item = request.getParameter("itm");
            List<ItemDTO> itemDTOs = new ItemServiceImpl().showItems();
            out.print("<style>");
            out.print("table,th,td{border: solid black;border-collapse: collapse}");
            out.print("</style>");
            out.print("<table>");
            out.print("<tr>");
            out.print("<td>");
            out.print("Item ID");
            out.print("</td>");
            out.print("<td>");
            out.print("Item Category");
            out.print("</td>");
            out.print("<td>");
            out.print("Item Name");
            out.print("</td>");
            out.print("<td>");
            out.print("Item Qty");
            out.print("</td>");
            out.print("<td>");
            out.print("Unit Price");
            out.print("</td>");
            out.print("<td>");
            out.print("Total");
            out.print("</td>");
            out.print("</tr>");
            Integer itemCount = (Integer) session.getAttribute(item);
            if (null == itemCount) {
                itemCount = 0;
            }

            itemCount++;
            session.setAttribute(item, itemCount);
            int total;
            int tot=0;
            for (ItemDTO itemlist1 : itemDTOs) {
                out.print("<tr>");
                out.print("<td>");
                out.print(itemlist1.getItemId());
                out.print("</td>");
                out.print("<td>");
                out.print(itemlist1.getItemCategory());
                out.print("</td>");
                out.print("<td>");
                out.print(itemlist1.getItemName());
                out.print("</td>");
                out.print("<td>");
                Integer qty = (Integer) session.getAttribute(itemlist1.getItemQty());
                if (null != qty) {
                    out.print(qty);
                    out.print("</td>");
                    out.print("<td>");
                    out.print(itemlist1.getUnitPrice());
                    out.print("</td>");
                    out.print("<td>");
                    total=qty*Integer.parseInt(itemlist1.getUnitPrice());
                    out.print(total);
                    tot=tot+total;
                    out.print("</td>");
                    out.print("</tr>");
                    
                }
            }

            out.print("<tr>");
            out.print("<td>");
            out.print("Total");
            out.print("</td>");
            out.print("<td>");

            out.print("</td>");
            out.print("<td>");

            out.print("</td>");
            out.print("<td>");

            out.print("</td>");
            out.print("<td>");

            out.print("</td>");
            out.print("<td>");
            out.print(tot);
            out.print("</td>");
            out.print("</tr>");
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
