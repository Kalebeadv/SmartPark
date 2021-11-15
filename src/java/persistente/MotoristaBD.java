/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Motorista;

/**
 *
 * @author kaleb
 */
public class MotoristaBD {
    
    private String html_do_motorista = "";
   
    
    public String mostrar_motoristas(ArrayList <Motorista> motoristas)
    {
        motoristas.forEach(motorista -> {
            html_do_motorista = html_do_motorista +
                    "<p>Nome do motorista: " + motorista.getNome() +
                    "<br>Telefone do motorista: " + motorista.getTelefone() +
                    "</p>";
        });
        return html_do_motorista;
    }

    public String pagar_por_retirada_do_veiculo(String tipoDepagamento, 
                                                Double valor_total)
    {
        return html_do_motorista = 
                "<h4>NOTA FISCAL</h4><br>" +
                "<p>valor total: </p>" + valor_total.toString() +
                "<p>forma de pagamento: " + tipoDepagamento +
                "<p>-------------------</p>";
                
    }
    
    public String buscaNome(ArrayList <Motorista> motoristas, String nome){
        motoristas.forEach(motorista -> {
            if(nome.toLowerCase().equals(motorista.getNome().toLowerCase())){
                html_do_motorista = html_do_motorista +
                    "<p>Nome do motorista: " + motorista.getNome() +
                    "<br>Telefone do motorista: " + motorista.getTelefone() +
                    "</p>";
            }
        });
        return html_do_motorista;
    }
    
    public String devolver_motoristas(int index, ArrayList <Motorista> motorista)
    {
        return  html_do_motorista = html_do_motorista +
                "<p>Nome do motorista: " + motorista.get(index).getNome() +
                "<br>Telefone do motorista: " + motorista.get(index).
                                                                getTelefone() +
                "</p>";
    }
}
