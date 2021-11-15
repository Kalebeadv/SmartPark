/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Endereco;
import model.Imovel;

/**
 *
 * @author gusta
 */
public class ImovelBD {
    
   
    
    public ArrayList <Imovel> buscaBairro(String bairro, ArrayList <Imovel> imoveis){
        ArrayList <Imovel> guardaImoveis = new ArrayList<>();
        for(int i=0;i<imoveis.size();i++){
            Imovel cadaImovel = imoveis.get(i);
            if (cadaImovel.getEndereco().getBairro().toLowerCase().equals(bairro.toLowerCase())){
                guardaImoveis.add(cadaImovel);
            }
        }
        return guardaImoveis;
    }
    public ArrayList <Imovel> buscaRegistro(String registro, ArrayList <Imovel> imoveis){
        ArrayList <Imovel> guardaImoveis = new ArrayList<>();
        for(int i=0;i<imoveis.size();i++){
            Imovel cadaImovel = imoveis.get(i);
            if (cadaImovel.getMatricula_prefeitura().equals(registro)){
                guardaImoveis.add(cadaImovel);
            }
        }
        return guardaImoveis;
    }
    
    public String exibeInfo(ArrayList <Imovel> selecionados){
        String htmlText = "";
        for(int i=0;i<selecionados.size();i++){
            htmlText = htmlText + "<h4>Endereco do Imovel</h4>"
            + "<p>CEP: " + selecionados.get(i).getEndereco().getCep() + "<br>"
            + "Pais: "+selecionados.get(i).getEndereco().getPais() +"<br>"
            + "Estado: "+selecionados.get(i).getEndereco().getEstado()+"<br>"
            + "Cidade: "+selecionados.get(i).getEndereco().getCidade()+"<br>"
            + "Bairro: "+selecionados.get(i).getEndereco().getBairro()+"<br>"
            + "Rua: "+selecionados.get(i).getEndereco().getRua()+"</p>"
            + "<h4>Informaçoes do Imovel</h4>"
            + "<p>Matricula da Prefeitura: "+ selecionados.get(i).getMatricula_prefeitura()+"<br>"
            + "Tamanho do Terreno: "+ selecionados.get(i).getTamanho_area()+"<br>"
            + "Geolocalização: "+ selecionados.get(i).getGeolocalizacao() + "<br>"
            + "Valor do aluguel: "+ selecionados.get(i).getValor_aluguel().toString()+ "<br>"
            + "Data que foi alugado: "+selecionados.get(i).getQuando_aluga() + "</p><br>"
            + "<hr size='1'>";
        }
        return htmlText;
    }
    
}
