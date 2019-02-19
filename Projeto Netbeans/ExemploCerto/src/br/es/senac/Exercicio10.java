
package br.es.senac;

import javax.swing.JOptionPane;


public class Exercicio10 {
    public static void main(String[] args) {
        //variável utilizada para leituras do teclado
        String leitura;
        
        //Processo de leitura
        leitura = JOptionPane.showInputDialog("Qual o custo de fábrica"
                + " do automóvel");
        //******************
        
        //conversão de texto(leitura/String) para número (float)
        float custoFab = Float.parseFloat(leitura);
        
        //custo do distribuidor
        float custoDist = custoFab * 28.00f / 100.00f ;
        //custo do imposto
        float custoImposto = custoFab * 45.00f / 100.00f;
        //custo total
        float custoTotal = custoFab + custoDist + custoImposto;
        // "Escreva" no modo prompt comando
        System.out.println("CUSTO TOTAL: " + custoTotal);
        //"Escreva no modo gráfico"
        JOptionPane.showMessageDialog(null, "CUSTO TOTAL: " + custoTotal);
    }
}
