/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park.model;

import java.util.Date;

/**
 *
 * @author kaleb
 */
public class Imovel {
    
    private Endereco endereco;
    private String matricula_prefeitura;
    private String tamanho_area;
    private String geolocalizacao;
    private Integer valor_aluguel;
    private Date quando_aluga;

    public Imovel() {
    }

    
    public Imovel(Endereco endereco, String matricula_prefeitura, 
                  String tamanho_area, String geolocalizacao, 
                  Integer valor_aluguel, Date quando_aluga) {
        this.endereco = endereco;
        this.matricula_prefeitura = matricula_prefeitura;
        this.tamanho_area = tamanho_area;
        this.geolocalizacao = geolocalizacao;
        this.valor_aluguel = valor_aluguel;
        this.quando_aluga = quando_aluga;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getMatricula_prefeitura() {
        return matricula_prefeitura;
    }

    public String getTamanho_area() {
        return tamanho_area;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public Integer getValor_aluguel() {
        return valor_aluguel;
    }

    public Date getQuando_aluga() {
        return quando_aluga;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setMatricula_prefeitura(String matricula_prefeitura) {
        this.matricula_prefeitura = matricula_prefeitura;
    }

    public void setTamanho_area(String tamanho_area) {
        this.tamanho_area = tamanho_area;
    }

    public void setGeolocalizacao(String geolocalizacao) {
        this.geolocalizacao = geolocalizacao;
    }

    public void setValor_aluguel(Integer valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public void setQuando_aluga(Date quando_aluga) {
        this.quando_aluga = quando_aluga;
    }
    
    
}
