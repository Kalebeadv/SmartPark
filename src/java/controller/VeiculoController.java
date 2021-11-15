/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.ArrayList;
import model.Veiculo;
import persistente.VeiculoBD;

/**
 *
 * @author gusta
 */
public class VeiculoController extends HttpServlet {

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
            throws ServletException, IOException 
    {
        String placa_veiculo = request.getParameter("placa_veiculo");
        String modelo_veiculo = request.getParameter("modelo_veiculo");
        String get_todos_os_veiculos = request.getParameter("todos");
        String receber_dados_do_veiculo;
        
        Veiculo veiculo1 = new Veiculo("KAL3B37","ONIX","PRETO-ESCURO-ESCURO");
        Veiculo veiculo2 = new Veiculo("BLZ1KB1","GOL","VERDE");
        Veiculo veiculo3 = new Veiculo("IPC0NF6","FERRARI","VERDE-VOMITO");
        Veiculo veiculo4 = new Veiculo("SPY0G60","MODEL3","DARK-MATTER");
        
        VeiculoBD bdVeiculo = new VeiculoBD();
        ArrayList <Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        
        if(get_todos_os_veiculos == null)
        {
            if(placa_veiculo == null)
            {
                receber_dados_do_veiculo = 
                        bdVeiculo.consultar_por_modelo(veiculos,modelo_veiculo);
            }
            else
                receber_dados_do_veiculo = 
                          bdVeiculo.consultar_por_placa(veiculos,placa_veiculo);
        }
        else
        {
            receber_dados_do_veiculo = 
                                   bdVeiculo.mostrar_todos_os_veiculos(veiculos);
        }
        
        request.setAttribute("Texto", receber_dados_do_veiculo);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraProprietarios.jsp");
        dispatcher.forward(request, response);
        
        
    }

}
