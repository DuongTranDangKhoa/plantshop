/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Khoa Duong
 */
public class dispatch extends HttpServlet {

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
        String button = request.getParameter("btAction");
        String url = "";
       
        if (button.equals("Login")) {
             url = "loginServlet";
        } else if (button.equals("Registrate")) {
            url = "registerServlet";
        } else if (button.equals("create")) {
            url="index.html";
        } else if (button.equals("search")) {
            url="searchServlet";
        }else if (button.equals("Signin")) {
            url="login.html";
        } else if (button.equals("Signup")) {
            url="register.html";
        } else if (button.equals("Signout")) {
            url="logoutServlet";
        } else if(button.equals("Mange")){
            url="mangeServlet";
        } else if (button.equals("checkout")) {
            url="saveOrder";
        } else if (button.equals("MAC")) {
            url="mangeServlet";
        } else if (button.equals("change")) {
            url="changeAccount";
        } else if (button.equals("DeleteAccount")) {
            url="deleteAccount";
        } else if (button.equals("UpdateAccount")) {
            url="updateAccount";
        }
        request.getRequestDispatcher(url).forward(request, response);
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
