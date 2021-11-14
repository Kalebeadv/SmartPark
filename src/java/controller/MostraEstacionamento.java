/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import model.Imovel;
import persistente.ImovelBD;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
//import java.util.ArrayList;
//import java.util.List;


/**
 *
 * @author gusta
 */
@WebServlet(name = "MostraEstacionamento", urlPatterns = {"/MostraEstacionamento"})
public class MostraEstacionamento extends HttpServlet {

   

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
        
        String bairro = request.getParameter("bairro");
        
        
        ImovelBD bancoImovel = new ImovelBD();
        bancoImovel.adicionarImovel();
        
        bancoImovel.busca(bairro);
        request.setAttribute("Imovel", bancoImovel);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/ListaEstacionamento.jsp");
        dispatcher.forward(request, response);
    }
}
