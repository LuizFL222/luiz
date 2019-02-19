package br.senac;

import javax.swing.JOptionPane;

public class Exercício8 {

    public static void main(String[] args) {

        String leitura;

        leitura = JOptionPane.showInputDialog("Quantos eleitores possuem nesse município? ");
        int NumEleitores = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Quantos votos foram brancos? ");
        int NumVotosBrancos = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Quantos foram nulos?");
        int NumVotosNulos = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Quantos foram válidos?");
        int NumVotosValidos = Integer.parseInt(leitura);

        float PercentualVotosBrancos = (NumVotosBrancos * 100f) / NumEleitores;
        float PercentualVotosNulos = (NumVotosNulos * 100f) / NumEleitores;
        float PercentualVotosValidos = (NumVotosValidos * 100f) / NumEleitores;

        JOptionPane.showMessageDialog(null, "O percentual de votos Brancos é: " + PercentualVotosBrancos + "%");
        JOptionPane.showMessageDialog(null, "O percentual de votos Nulos é: " + PercentualVotosNulos + "%");
        JOptionPane.showMessageDialog(null, "O percentual de votos Válidos é: " + PercentualVotosValidos + "%");

    }

}
