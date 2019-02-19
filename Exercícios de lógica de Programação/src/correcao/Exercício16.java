package br.senac;

import javax.swing.JOptionPane;

public class Exercício16 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite seu ao de nascimento");
        double ano = Double.parseDouble(leitura);

        if (ano < 2001) {
            JOptionPane.showMessageDialog(null, " Você poderá votar esse ano! ");
        } else {

            JOptionPane.showMessageDialog(null, "Você não poderá votar esse ano! ");
        }

    }
}
