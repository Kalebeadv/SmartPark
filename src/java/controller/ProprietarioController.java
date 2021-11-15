/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Proprietario;
import persistente.ProprietarioBD;

/**
 *
 * @author gusta
 */
public class ProprietarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        
        String selecionados;
        String cpf = request.getParameter("cpf");
        String todos = ""; 
        todos += request.getParameter("todos");
        //todos essas informaçoes ficariam no BANCO DE DADOS mas não temos um
        Proprietario proprietario1 = new Proprietario("José","999887643","78812312",
                                                   "20/12/1980");
        Proprietario proprietario2 = new Proprietario("Armando","8877433","12321223"
                                                 ,"13/03/1973");
        Proprietario proprietario3 = new Proprietario("Horlando","999765472",
                                                  "9933999","04/05/1990");
        Proprietario proprietario4 = new Proprietario("Carla","88776655","88766677"
                                                 ,"03/07/1960");
        ArrayList<Proprietario> proprietarios = new ArrayList<>();
        
        proprietarios.add(proprietario1);
        proprietarios.add(proprietario2);
        proprietarios.add(proprietario3);
        proprietarios.add(proprietario4);
        ProprietarioBD bdProp = new ProprietarioBD();
        
        if (todos.equals("true")){
            selecionados = bdProp.mostrar_proprietarioss(proprietarios);
        }else{
            selecionados = bdProp.proprietario_escolhido(proprietarios, cpf);
        }
        
        
        request.setAttribute("Texto", selecionados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraProprietarios.jsp");
        dispatcher.forward(request, response);
    }

}
