/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistente;

import java.util.ArrayList;
import model.Estacionamento;


 
/**
 *
 * @author gusta
 */
public class EstacionamentoBD{
        private final ArrayList<Estacionamento> estacionamentos = new ArrayList<>();
        private String texto_html_dos_estacionamentos = "";
        private double valor_inicial = 0;
        private double valor_da_taxa_por_hora = 0;
        private Double contador_do_valor_arrecadado_no_dia = 0.00;
        private Estacionamento vaga1_centro = new Estacionamento(1,1);
        private Estacionamento vaga4_nao_centro = new Estacionamento(4,4);
        private Estacionamento vaga5_12_horas = new Estacionamento(5,5);
        private Estacionamento vaga6_cortesia = new Estacionamento(6,6);
        
        public void Registro(String tipo_da_vaga)
        {
            if(tipo_da_vaga.equalsIgnoreCase("centro"))
            {
                estacionamentos.add(vaga1_centro);
                
            }
            else if(tipo_da_vaga.equalsIgnoreCase("nao_centro"))
            {
                estacionamentos.add(vaga4_nao_centro);
            }
            else if(tipo_da_vaga.equalsIgnoreCase("12_horas"))
            {
                estacionamentos.add(vaga5_12_horas);
            }
            else
            {
                estacionamentos.add(vaga6_cortesia);
            }
            
        }
        
        public String mostrar_estacionamentos()
        {
            
            for (int i = 0; i < estacionamentos.size(); i++)
            {
                texto_html_dos_estacionamentos +=
                        
                "<p>Codígo da vaga: </p>" + estacionamentos.get(i)
                                           .getCodigo_vaga().toString() +
                "<p>Número da vaga: </p>" + estacionamentos.get(i).
                                            getNumero_vaga().toString();
            }
            
            return texto_html_dos_estacionamentos;
        }
        
        public double preco_ticket_centro_tempo_estacionado(double tempo)
        {
            valor_inicial = 5.00;
            valor_da_taxa_por_hora = 1.00 * tempo;
            contador_do_valor_arrecadado_no_dia = valor_inicial + 
                                                  valor_da_taxa_por_hora;
            return valor_inicial + valor_da_taxa_por_hora;
        }
        
        public double preco_tickt_qualquer_outro_local_estacionado(double tempo)
        {
            valor_inicial = 3.00;
            valor_da_taxa_por_hora = 0.50 * tempo;
            contador_do_valor_arrecadado_no_dia = valor_inicial + 
                                                  valor_da_taxa_por_hora;
            return valor_inicial + valor_da_taxa_por_hora;
        }
        
        public double _12_horas_especiais_tickets()
        {
            valor_inicial = 7.0;
            valor_da_taxa_por_hora = 0.20 * 12;  
            contador_do_valor_arrecadado_no_dia = valor_inicial + 
                                                  valor_da_taxa_por_hora;
            return valor_inicial + valor_da_taxa_por_hora;
        }
        
        public double cortesia_tickets()
        {
            return 0.00;
        }

        public ArrayList<Estacionamento> getEstacionamentos() 
        {
            return estacionamentos;
        }
        
        public String finalizar_dia_de_trabalho()
        {
           return  texto_html_dos_estacionamentos = 
                   "<p> Valor arrecadado no dia: </p>" + 
                           contador_do_valor_arrecadado_no_dia.toString() +
                   "<p>Vagas disponiveis:  Nenhuma</p>";
                   
        }

        public Estacionamento getVaga1_centro() {
            return vaga1_centro;
        }

        public Estacionamento getVaga4_nao_centro() {
            return vaga4_nao_centro;
        }

        public Estacionamento getVaga5_12_horas() {
            return vaga5_12_horas;
        }

        public Estacionamento getVaga6_cortesia() {
            return vaga6_cortesia;
        }

        public void setVaga1_centro(Estacionamento vaga1_centro) {
            this.vaga1_centro = vaga1_centro;
        }

        public void setVaga4_nao_centro(Estacionamento vaga4_nao_centro) {
            this.vaga4_nao_centro = vaga4_nao_centro;
        }

        public void setVaga5_12_horas(Estacionamento vaga5_12_horas) {
            this.vaga5_12_horas = vaga5_12_horas;
        }

        public void setVaga6_cortesia(Estacionamento vaga6_cortesia) {
            this.vaga6_cortesia = vaga6_cortesia;
        }
}
