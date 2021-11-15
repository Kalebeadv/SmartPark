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
import model.Motorista;
import model.Veiculo;
import persistente.EstacionamentoBD;
import persistente.MotoristaBD;
import persistente.VeiculoBD;

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
            throws ServletException, IOException 
    {
        //Como não temos banco de dados, infelizmente tivemos que duplicar codigo
        String  texto = "";
        
        Estacionamento vaga1_centro = new Estacionamento(1,1);
        Estacionamento vaga4_nao_centro = new Estacionamento(4,4);
        Estacionamento vaga5_12_horas = new Estacionamento(5,5);
        Estacionamento vaga6_cortesia = new Estacionamento(6,6);
        
        EstacionamentoBD bdEstacionamento = new EstacionamentoBD();
        ArrayList<Estacionamento> estacionamentos = new ArrayList<>();
        estacionamentos.add(vaga1_centro);
        estacionamentos.add(vaga4_nao_centro);
        estacionamentos.add(vaga5_12_horas);
        estacionamentos.add(vaga6_cortesia);
        
        
        
        MotoristaBD bdMotorista = new MotoristaBD();
        ArrayList <Motorista> motoristas = new ArrayList<>();
        Motorista motorista1 = new Motorista("Jaimes","99922853");
        Motorista motorista2 = new Motorista("Ana", "999778833");
        Motorista motorista3 = new Motorista("Willian", "8899331122");
        Motorista motorista4 = new Motorista("Spy", "99999999");
        Motorista motorista5 = new Motorista("DANIAA","<3<3<3<3<3<3");
        motoristas.add(motorista1);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        motoristas.add(motorista4);
        motoristas.add(motorista5);
        
        VeiculoBD bdVeiculo = new VeiculoBD();
        ArrayList <Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo1 = new Veiculo("KAL3B37","ONIX","PRETO-ESCURO-ESCURO");
        Veiculo veiculo2 = new Veiculo("BLZ1KB1","GOL","VERDE");
        Veiculo veiculo3 = new Veiculo("IPC0NF6","FERRARI","VERDE-VOMITO");
        Veiculo veiculo4 = new Veiculo("SPY0G60","MODEL3","DARK-MATTER");
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        
        String busca_por_nome = request.getParameter("busca_por_nome");
        Double valor_do_tickt = bdEstacionamento._12_horas_especiais_tickets();
        for(int i = 0; i < estacionamentos.size(); i++)
        {
            texto += bdMotorista.devolver_motoristas(i, motoristas);
            texto += bdVeiculo.devolver_veiculo(i, veiculos);
            texto += bdEstacionamento.devolver_estacionamento(i, estacionamentos);
            texto += bdEstacionamento.pagar_por_retirada(valor_do_tickt);
                   
        }
        
        request.setAttribute("Texto", texto);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/MostraVagas.jsp");
        dispatcher.forward(request, response);
       
        processRequest(request, response);
    }

}
