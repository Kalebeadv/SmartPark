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
    /*
    private Integer placa;
    private Integer modelo;
    private String cor;
    */
    private final ArrayList <Veiculo> veiculos = new ArrayList<>();
    private String html_do_veiculo = "";
    
    public String mostrar_veiculos()
    {
        veiculos.forEach(veiculo -> {
           html_do_veiculo = html_do_veiculo + 
           "<p>Placa do veiculo: </p>" + veiculo.getPlaca().toString() +
           "<p>Modelo do veiculo: </p>" + veiculo.getModelo().toString() +
           "<p></p>" + veiculo.getCor();        
        });
        return html_do_veiculo;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    
    
}
