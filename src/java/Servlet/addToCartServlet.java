/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.CartDAO;
import DAO.PlantDAO;
import DTO.AccountDTO;
import DTO.PlantDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class addToCartServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String bt = request.getParameter("btAction");
            int value = Integer.parseInt(request.getParameter("quantity"));
            int key = Integer.parseInt(request.getParameter("key"));
            if (bt.equals("+")) {
                ++value;
                request.setAttribute("qu", value);
                request.getRequestDispatcher("detail.jsp?key=" + key).forward(request, response);
            } else if (bt.equals("-")) {
                value--;
                request.setAttribute("qu", value);
                request.getRequestDispatcher("detail.jsp?key=" + key).forward(request, response);
            } else if (bt.equals("cart")||bt.equals("remove")||bt.equals("downcart")) {
                int pid = Integer.parseInt(request.getParameter("id"));
                int quantity = Integer.parseInt(request.getParameter("quantity"));

                PlantDAO dao = new PlantDAO();
                PlantDTO dto = dao.getPlantById(pid);
                HttpSession session = request.getSession(true);
                AccountDTO accountDTO = (AccountDTO) session.getAttribute("acc");
                CartDAO daocart = new CartDAO();
          

                if (session != null) {
                    HashMap<PlantDTO, Integer> cart = (HashMap<PlantDTO, Integer>) session.getAttribute("cart");
                    if (cart == null) {
                        cart = new HashMap<>();
                        cart.put(dto, quantity);
                            
    
                    } else {
                        Set<PlantDTO> list = cart.keySet();
                        int tmp = 0;
                        if (bt.equals("cart")) {
                            
                        for (PlantDTO plantDTO : list) {
                            if (plantDTO.getId() == pid) {
                                tmp = cart.get(plantDTO);
                                tmp += quantity;
                                cart.replace(plantDTO, tmp);
//                            cart.remove(plantDTO);
                        //        daocart.updatetoCart(dto.getId(), quantity);
                            }
                        }

                        if (tmp == 0) {
                            cart.put(dto, quantity);
                        //    daocart.addtoCart(accountDTO.getAccID(), dto.getId(), dto.getName(), dto.getPrice(), quantity);
                        }
                        }else if(bt.equals("remove")){           
                        for (PlantDTO plantDTO : list) {
                            if (plantDTO.getId() == pid) {
                             cart.remove(plantDTO);
                        //        daocart.updatetoCart(dto.getId(), quantity);
                            }
                        }
                        }else if (bt.equals("cart-")) {
                            for (PlantDTO plantDTO : list) {
                            if (plantDTO.getId() == pid) {
                                tmp = cart.get(plantDTO);
                                tmp -= quantity;
                                cart.replace(plantDTO, tmp);
                        if (tmp == 0) {
                        cart.replace(plantDTO, 1);
                        }
//                            cart.remove(plantDTO);
                        //        daocart.updatetoCart(dto.getId(), quantity);
                            }
                        }

                        }
                    }
                    session.setAttribute("cart", cart);

                }
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            }

        } catch (Exception e) {
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
