package br.senac;

import javax.swing.JOptionPane;

public class Exercício15 {

    public static void main(String[] args) {
        String leitura;

        double precoTotal;
        leitura = JOptionPane.showInputDialog("Quantas maçãs foram compradas?");
        int macas = Integer.parseInt(leitura);

        if (macas < 12) {

            precoTotal = macas * 1.30;
        } else {

            precoTotal = macas * 1.00;
        }
        JOptionPane.showMessageDialog(null, "O total a ser pago é : " + precoTotal);

    }
}
