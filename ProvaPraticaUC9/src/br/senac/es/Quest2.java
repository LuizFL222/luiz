package br.senac.es;

import javax.swing.JOptionPane;

public class Quest2 {

    public static void main(String[] args) {
        String leitura;
        double A;
        double B;
        double div;
        do {
            leitura = JOptionPane.showInputDialog("Digite o valor A: ");
            A = Integer.parseInt(leitura);

            leitura = JOptionPane.showInputDialog("Digite o valor B: ");
            B = Integer.parseInt(leitura);
        } while (A % 2 == 1 && B % 2 <= 1);
        div = A / B;

        JOptionPane.showMessageDialog(null, "O resultado é: " + div);
    }
}
