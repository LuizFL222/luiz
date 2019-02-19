package br.senac;

import javax.swing.JOptionPane;

public class exercicio5 {

    public static void main(String[] args) {
        System.out.println("Número digitado");
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite seu número");
        int a = Integer.parseInt(leitura);
        a = a - 1;
        System.out.println("antecessor " + a);

    }

}
