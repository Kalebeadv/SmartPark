/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author kaleb
 */
public class VeiculoBD {
    
    private String html_do_veiculo = "";
    
    public String mostrar_todos_os_veiculos(ArrayList <Veiculo> veiculos)
    {
        veiculos.forEach(veiculo -> {
           html_do_veiculo = html_do_veiculo + 
           "<p>Placa do veiculo: " + veiculo.getPlaca() +
           "<br>Modelo do veiculo: " + veiculo.getModelo() +
           "<br>Cor do veiculo: " + veiculo.getCor() + "</p><hr size='1'>";        
        });
        return html_do_veiculo;
    }
    
    public String consultar_por_modelo(ArrayList<Veiculo> veiculos, String modelo)
    {
        veiculos.forEach(veiculo -> {
           if(modelo.equals(veiculo.getModelo()))
           {
                html_do_veiculo = html_do_veiculo + 
                "<p>Placa do veiculo: " + veiculo.getPlaca() +
                "<br>Modelo do veiculo: " + veiculo.getModelo() +
                "<br>Cor do veiculo: " + veiculo.getCor() + "</p><hr size='1'>";
           }
        });
        return html_do_veiculo;
    }
            
    public String consultar_por_placa(ArrayList<Veiculo> veiculos, String placa)
    {
        veiculos.forEach(veiculo -> {
           if(placa.equals(veiculo.getPlaca()))
           {
                html_do_veiculo = html_do_veiculo + 
                "<p>Placa do veiculo: " + veiculo.getPlaca() +
                "<br>Modelo do veiculo: " + veiculo.getModelo() +
                "<br>Cor do veiculo: " + veiculo.getCor() + "</p><hr size='1'>";
           }
        });
        return html_do_veiculo;
                
    }
}
