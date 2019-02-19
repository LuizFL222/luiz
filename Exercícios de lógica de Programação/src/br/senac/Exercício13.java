package br.senac;

import javax.swing.JOptionPane;

public class Exercício13 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite um número");
        double NumeroX = Double.parseDouble(leitura);

        if (NumeroX > 10) {
            JOptionPane.showMessageDialog(null, " Seu número é maior que 10");
        } else {

            JOptionPane.showMessageDialog(null, "Seu número é menor que 10 ");
        }
    }
}
