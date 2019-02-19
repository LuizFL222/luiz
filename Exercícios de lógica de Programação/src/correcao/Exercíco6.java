package br.senac;

import javax.swing.JOptionPane;

public class Exercíco6 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite o valor da base");
        double base = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("altura");
        double altura = Double.parseDouble(leitura);

        double area = base * altura;
        JOptionPane.showMessageDialog(null, area);

    }
}
