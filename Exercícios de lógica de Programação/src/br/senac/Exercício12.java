package br.senac;

import javax.swing.JOptionPane;

public class Exercício12 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite a temperatura em"
                + " graus Fahrenheit");
        int Fahrenheit = Integer.parseInt(leitura);

        int Celsius = (int) ((Fahrenheit - 32) / 1.8);

        JOptionPane.showMessageDialog(null, Celsius);
    }
}
