package br.senac;

import javax.swing.JOptionPane;

public class Exercício10 {

    public static void main(String[] args) {

        String leitura;

        leitura = JOptionPane.showInputDialog("Qual o custo de fábrica do automóvel?");

        float cFab = Float.parseFloat(leitura);

        float cDist = cFab * 28.00f / 100.00f;

        float cImposto = cFab * 45.00f / 100.00f;

        float cTotal = cFab + cDist + cImposto;

        System.out.println("CUSTO TOTAL: " + cTotal);

        JOptionPane.showMessageDialog(null, "CUSTO TOTAL: " + cTotal);

    }
}
