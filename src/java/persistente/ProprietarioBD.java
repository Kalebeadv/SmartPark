package persistente;

import java.util.ArrayList;
import model.Proprietario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaleb
 */
public class ProprietarioBD {
    //Dados do proprietário: nome, telefone, cpf e data de nascimento.
    private String html_do_proprietario;
    
    public String proprietario_escolhido(ArrayList <Proprietario> proprietarios,String cpf)
    {
        html_do_proprietario = "";
        for (int i=0; i<proprietarios.size();i++){
            if (proprietarios.get(i).getCpf().equals(cpf)){
                html_do_proprietario = 
                "<p>Nome do proprietario: " + proprietarios.get(i).getNome() + "<br>"
              + "Telefone do proprietario: " + proprietarios.get(i).getTelefone() + "<br>"
              + "CPF do proprietario: " + proprietarios.get(i).getCpf() + "<br>"
              + "Data de nascimento do proprietario: " + proprietarios.get(i).getData_nascimento() + "</p>";
            return html_do_proprietario;
            }
        }
        return html_do_proprietario;
    }
    
    public String mostrar_proprietarioss(ArrayList <Proprietario> proprietarios)
    {
        html_do_proprietario = "";
        proprietarios.forEach(proprietario -> {
           html_do_proprietario += 
                "<p>Nome do proprietario: " + proprietario.getNome() + "<br>"
              + "Telefone do proprietario: " + proprietario.getTelefone() + "<br>"
              + "CPF do proprietario: " + proprietario.getCpf() + "<br>"
              + "Data de nascimento do proprietario: " + proprietario.getData_nascimento() + "</p>"
              + "<hr size='1'>";
        });
        
        return html_do_proprietario;
    }
   
    
}
