package persistente;

import java.util.ArrayList;
import model.Proprietario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
public class ProprietarioBD {
    //Dados do proprietário: nome, telefone, cpf e data de nascimento.
    private String html_do_proprietario;
    
    private final  ArrayList<Proprietario> proprietarios = 
                                            new ArrayList<Proprietario>();
    
    Proprietario proprietario1 = new Proprietario("José","999887643","78812312",
                                                   "20/12/1980");
    Proprietario proprietario2 = new Proprietario("Armando","8877433","12321223"
                                                 ,"13/03/1973");
    Proprietario proprietario3 = new Proprietario("Horlando","999765472",
                                                  "9933999","04/05/1990");
    Proprietario proprietario4 = new Proprietario("Carla","88776655","88766677"
                                                 ,"03/07/1960");
    
    public void adicionar_proprietarios()
    {
        proprietarios.add(proprietario1);
        proprietarios.add(proprietario2);
        proprietarios.add(proprietario3);
        proprietarios.add(proprietario4);
    }
    
    public String mostrar_proprietarioss()
    {
        proprietarios.forEach(proprietario -> {
           html_do_proprietario = 
                "<p>Nome do proprietario: </p>" + proprietario.getNome() +
                "<p>Telefone do proprietario: </p>" + proprietario.getTelefone()
              + "<p>CPF do proprietario: </p>" + proprietario.getCpf() +
                "<p>Data de nascimento do proprietario: </p>" +         
                                              proprietario.getData_nascimento();
        });
        
        return html_do_proprietario;
    }
   
    
}
