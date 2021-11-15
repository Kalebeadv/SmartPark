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
import model.Motorista;
import persistente.MotoristaBD;

/**
 *
 * @author gusta
 */
public class MotoristaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code>
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
        String nome = request.getParameter("nomeMotorista");
        String todos = request.getParameter("todos");
        String selecionados;
        
        
        Motorista motorista1 = new Motorista("Jaimes","99922853");
        Motorista motorista2 = new Motorista("Ana", "999778833");
        Motorista motorista3 = new Motorista("Willian", "8899331122");
        Motorista motorista4 = new Motorista("Spy", "99999999");
        Motorista motorista5 = new Motorista("DANIAA","<3<3<3<3<3<3");
        
        ArrayList <Motorista> motoristas = new ArrayList<>();
        
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        motoristas.add(motorista4);
        motoristas.add(motorista5);
        
        MotoristaBD bdMotorista = new MotoristaBD();
        
        if (todos == null){
            selecionados = bdMotorista.buscaNome(motoristas, nome);
        }else{
            selecionados = bdMotorista.mostrar_motoristas(motoristas);
        }
        
        request.setAttribute("Texto", selecionados);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraMotorista.jsp");
        dispatcher.forward(request, response);
    }

    

}
