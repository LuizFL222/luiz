package br.senac;

import javax.swing.JOptionPane;

public class Exercício14 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite um número");
        double NumeroX = Double.parseDouble(leitura);

        if (NumeroX > 0) {
            JOptionPane.showMessageDialog(null, " Seu numero é positivo ");
        } else {

            JOptionPane.showMessageDialog(null, "Seu numero é negativo ");
        }
    }
}
