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
    //nome
    //telefone
    private final ArrayList <Motorista> motoristas = new ArrayList<>();
    private String html_do_motorista = "";
    Motorista motorista1 = new Motorista("Jaimes","99922853");
    Motorista motorista2 = new Motorista("Ana", "999778833");
    Motorista motorista3 = new Motorista("Willian", "8899331122");
    Motorista motorista4 = new Motorista("Spy", "99999999");
    
    public void adicionar_motorista_ao_estacionamentos()
    {
       motoristas.add(motorista1);
       motoristas.add(motorista2);
       motoristas.add(motorista3);
       motoristas.add(motorista4);
    } 
    
    public String mostrar_motoristas()
    {
        motoristas.forEach(motorista -> {
            html_do_motorista = html_do_motorista +
                    "<p>Nome do motorista: </p>" + motorista.getNome() +
                    "<p>Telefone do motorista: </p>" + motorista.getTelefone() +
                    "<br>";
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
    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public Motorista getMotorista1() {
        return motorista1;
    }

    public void setMotorista1(Motorista motorista1) {
        this.motorista1 = motorista1;
    }

    public Motorista getMotorista2() {
        return motorista2;
    }

    public void setMotorista2(Motorista motorista2) {
        this.motorista2 = motorista2;
    }

    public Motorista getMotorista3() {
        return motorista3;
    }

    public void setMotorista3(Motorista motorista3) {
        this.motorista3 = motorista3;
    }

    public Motorista getMotorista4() {
        return motorista4;
    }

    public void setMotorista4(Motorista motorista4) {
        this.motorista4 = motorista4;
    }
    
    
}
