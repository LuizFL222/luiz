package br.senac;

import javax.swing.JOptionPane;

public class Exercício26 {

    public static void main(String[] args) {
        String leitura;
        double V1;
        double V2;

        leitura = JOptionPane.showInputDialog("Digite V1");
        V1 = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite V2");
        V2 = Double.parseDouble(leitura);

        if (V1 > V2) {
            JOptionPane.showMessageDialog(null, " V1 é maior " + V1);
        } else if (V1 < V2) {
            JOptionPane.showMessageDialog(null, " V2 é maior " + V2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais ");
        }
    }
}
