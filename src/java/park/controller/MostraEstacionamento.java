/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package park.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import java.util.List;
import park.model.*;


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
   
        Endereco centro = new Endereco("6565899","Brasil","Acre","Rio Branco","Centro","NovaVelha","569");
        Endereco semCentro = new Endereco("7987985","Brasil","Acre","Bujari","Pompeu","VelhaNova","644");
        
        Imovel imo = new Imovel(centro, "7899877", "40x50", "-56232165564 +564654656", 5.00, "01/05/20");
        Imovel imo1 = new Imovel(semCentro, "5465613", "50x20", "-565656532 -45457878787", 3.00, "12/05/21");
        Imovel imo2 = new Imovel(centro,"5465456","80x10","-56232165564 +564654656", 5.00, "14/23/19");
        Imovel imo3 = new Imovel(semCentro, "8798787877", "25x20", "-56232165564 +564654656", 2.50, "18/04/22");
        
        ArrayList <Imovel> imoveis = new ArrayList<Imovel>();
        
        imoveis.add(imo);
        imoveis.add(imo1);
        imoveis.add(imo2);
        imoveis.add(imo3);
        request.setAttribute("Imo", imoveis);
        
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/ListaEstacionamento.jsp");
        dispatcher.forward(request, response);
    }
}
