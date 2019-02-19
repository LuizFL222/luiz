package br.senac;

import javax.swing.JOptionPane;

public class Exercício21 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite um número: ");
        int A = Integer.parseInt(leitura);

        if (A > 0) {
            JOptionPane.showMessageDialog(null, "Seu número é positivo! ");
        } else if (A == 0) {
            JOptionPane.showMessageDialog(null, "Seu número é zero!");

        } else {
            JOptionPane.showMessageDialog(null, "Seu número é negativo!");
        }
    }
}
