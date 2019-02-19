
package br.es.senac;

import javax.swing.JOptionPane;


public class exercício5 {
    
    public static void main(String[] args) {
        System.out.println("Número digitado");
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite seu Número");
        int antecessor = Integer.parseInt (leitura);
        antecessor = antecessor -1;
        System.out.println("antecessor  = " + antecessor);
    }
}