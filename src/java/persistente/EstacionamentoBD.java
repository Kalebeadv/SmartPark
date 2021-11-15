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
        private String texto_html_dos_estacionamentos = "";
        private double valor_inicial = 0;
        private double valor_da_taxa_por_hora = 0;
        private Double contador_do_valor_arrecadado_no_dia = 0.00;
       
        
        public String mostrar_estacionamentos(ArrayList <Estacionamento> estacionamentos)
        {
            
            for (int i = 0; i < estacionamentos.size(); i++)
            {
                texto_html_dos_estacionamentos +=
                        
                "<p>Codígo da vaga: " + estacionamentos.get(i)
                                           .getCodigo_vaga().toString()+ "<br>" +
                "Número da vaga: " + estacionamentos.get(i).
                                            getNumero_vaga().toString() + "</p>";
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
        
        public String finalizar_dia_de_trabalho()
        {
           return  texto_html_dos_estacionamentos = 
                   "<p> Valor arrecadado no dia: </p>" + 
                           contador_do_valor_arrecadado_no_dia.toString() +
                   "<p>Vagas disponiveis:  Nenhuma</p>";
                   
        }

        
}
