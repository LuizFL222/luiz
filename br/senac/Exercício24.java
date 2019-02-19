package br.senac;

import javax.swing.JOptionPane;

public class Exercício24 {

    public static void main(String[] args) {
        String leitura;
        double a;
        double b;
        double c;

        leitura = JOptionPane.showInputDialog("Digite"
                + " o valor de A ");
        a = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite"
                + " o valor de B");
        b = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite"
                + " o valor de C");
        c = Double.parseDouble(leitura);

        if (a < b + c && b < a + c && c < a + b) {
            JOptionPane.showMessageDialog(null, "Forma um triângulo! ");
        } else {
            JOptionPane.showMessageDialog(null, " Não forma um triangulo!");
        }
    }
}
