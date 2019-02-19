package br.senac;

import javax.swing.JOptionPane;

public class Exercício17 {

    public static void main(String[] args) {

        String leitura;
        int V1;
        int V2;
        leitura = JOptionPane.showInputDialog("Digite V1");
        V1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Digite V2");
        V2 = Integer.parseInt(leitura);
        if (V1 < V2) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + V1 +
                    " e " + V2);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem decrescente: " + V2 +
                    " e " + V1);
        }

    }

}
