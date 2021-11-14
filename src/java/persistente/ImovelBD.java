/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Imovel;

/**
 *
 * @author gusta
 */
public class ImovelBD {
    
    private static final ArrayList <Imovel> imoveis = new ArrayList<>();
    
    private final Endereco centro = new Endereco("6565899","Brasil",
            "Acre","Rio Branco", "Centro","NovaVelha","569");
    private final Endereco semCentro = new Endereco("7987985","Brasil",
            "Acre","Bujari", "Pompeu","VelhaNova","644");
    private final Imovel imo = new Imovel(centro, "7899877", "40x50", 
            "-56232165564 +564654656", 5.00, "01/05/20");
    private final Imovel imo1 = new Imovel(semCentro, "5465613", "50x20", 
            "-565656532 -45457878787", 3.00, "12/05/21");
    private final Imovel imo2 = new Imovel(centro,"5465456","80x10",
            "-56232165564 +564654656", 5.00, "14/23/19");
    private final Imovel imo3 = new Imovel(semCentro, "8798787877", 
            "25x20", "-56232165564 +564654656", 2.50, "18/04/22");
    
   
    public void adicionarImovel(){
        imoveis.add(imo);
        imoveis.add(imo1);
        imoveis.add(imo2);
        imoveis.add(imo3);
    }
    
    public ArrayList <Imovel> busca(String bairro){
        ArrayList <Imovel> guardaImoveis = new ArrayList<>();
        for(int i=0;i<imoveis.size();i++){
            Imovel cadaImovel = imoveis.get(i);
            if (cadaImovel.getEndereco().getBairro().equals(bairro)){
                guardaImoveis.add(cadaImovel);
            }
         }
         return guardaImoveis;
     }
}
