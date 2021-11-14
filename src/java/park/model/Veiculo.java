/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park.model;

/**
 *
 * @author kaleb
 */
public class Veiculo implements java.io.Serializable{
  
//Dados do veículo: placa, modelo e cor.
    private Integer placa;
    private Integer modelo;
    private String cor;

    public Veiculo() {
    }

    public Veiculo(Integer placa, Integer modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Integer getPlaca() {
        return placa;
    }

    public Integer getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    

    
}
