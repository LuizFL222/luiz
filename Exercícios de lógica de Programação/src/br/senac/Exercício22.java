package br.senac;

import javax.swing.JOptionPane;

public class Exercício22 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o valor A: ");
        double A = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite o valor B: ");
        double B = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite o valor C: ");
        double C = Double.parseDouble(leitura);

        if ((A < B) && (B < C)) {
            double Soma = B + C;
            JOptionPane.showMessageDialog(null, Soma);
        } else if ((A < C) && (C < B)) {
            double Soma = B + C;
            JOptionPane.showMessageDialog(null, Soma);
        } else if ((B < C) && (A < C)) {
            double Soma = C + A;
            JOptionPane.showMessageDialog(null, Soma);
        } else if ((B < C) && (C < A)) {
            double Soma = A + C;
            JOptionPane.showMessageDialog(null, Soma);
        } else if ((C < A) && (C < A)) {
            double Soma = B + A;
            JOptionPane.showMessageDialog(null, Soma);
        } else {
            double Soma = A + B;
            JOptionPane.showMessageDialog(null, Soma);
        }
    }
}
