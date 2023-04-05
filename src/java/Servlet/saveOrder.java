/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.OrderDAO;
import DTO.AccountDTO;
import DTO.OrderDTO;
import DTO.OrderDetail;
import DTO.PlantDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Khoa Duong
 */
public class saveOrder extends HttpServlet {

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
        try {
            HttpSession session = request.getSession(false);
            if (session != null) {
//                String name = (String) session.getAttribute("username");
//                String email = (String) session.getAttribute("email"); 
                AccountDTO acc = (AccountDTO) session.getAttribute("acc");
                HashMap<PlantDTO, Integer> cart = (HashMap<PlantDTO, Integer>) session.getAttribute("cart");
                if (acc == null) {
                    request.setAttribute("WARNING", "you must login!");
                        request.getRequestDispatcher("cart.jsp").forward(request, response);
                } else {
                    if (cart != null && !cart.isEmpty()) {
//                        OrderDTO orderDTO = new OrderDTO(order_date, shipDate, 1, acc.getAccID());
                        OrderDAO.insertOrder(acc.getEmail(), cart);
//                        Set<PlantDTO> items = cart.keySet();
//                        for (PlantDTO plant : items) {
//                            OrderDetail detail = new OrderDetail(orderDTO.getOrderID(), plant.getId(), plant.getName(), plant.getPrice(), plant.getImgpath(), cart.get(plant));
//                            
//                        }
//                        boolean result = OrderDAO.insertOrder(email, cart);
//                        if (result) {
//                            session.setAttribute("cart", null); 
//                            request.setAttribute("WARNING", "save your cart sucessfully");
//                            request.getRequestDispatcher("cart.jsp").forward(request, response);
                    } else {
                        request.setAttribute("WARNING", "your cart is empty");
                        request.getRequestDispatcher("cart.jsp").forward(request, response);
                    }
                }
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } catch (Exception e) {
            log("Error at MainController " + e.toString());
        }

        request.getRequestDispatcher("checkout.jsp").forward(request, response);
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
