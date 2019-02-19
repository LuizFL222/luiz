package br.senac;

import javax.swing.JOptionPane;

public class Exercício15 {

    public static void main(String[] args) {
        String leitura;

        double precoTotal;
        leitura = JOptionPane.showInputDialog("Quantas maçãs foram compradas?");
        int macas = Integer.parseInt(leitura);
        //condição lógica
        if (macas < 12) {
            //se a condição for verdadeira, faça os comandos abaixo
            precoTotal = macas * 1.30;
        } else {
            //se a condição anterior for falsa, faça os comandos abaixo
            precoTotal = macas * 1.00;
        }
        JOptionPane.showMessageDialog(null, "O total a ser pago é : " + precoTotal);

    }
}
