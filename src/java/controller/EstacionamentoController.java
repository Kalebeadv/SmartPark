/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;



import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Estacionamento;
import persistente.EstacionamentoBD;

/**
 *
 * @author gusta
 */
public class EstacionamentoController extends HttpServlet {

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
        Estacionamento vaga1_centro = new Estacionamento(1,1);
        Estacionamento vaga4_nao_centro = new Estacionamento(4,4);
        Estacionamento vaga5_12_horas = new Estacionamento(5,5);
        Estacionamento vaga6_cortesia = new Estacionamento(6,6);
        
        ArrayList<Estacionamento> estacionamentos = new ArrayList<>();
        
        estacionamentos.add(vaga1_centro);
        estacionamentos.add(vaga4_nao_centro);
        estacionamentos.add(vaga5_12_horas);
        estacionamentos.add(vaga6_cortesia);
        
        EstacionamentoBD esta = new EstacionamentoBD();
        
        String Texto = esta.mostrar_estacionamentos(estacionamentos);
        
        request.setAttribute("Texto", Texto);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraVagas.jsp");
        dispatcher.forward(request, response);
       
        processRequest(request, response);
    }

}
