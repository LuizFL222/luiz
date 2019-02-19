package br.senac;

import javax.swing.JOptionPane;

public class Exercício7 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite sua idade em anos! ");
        int Anos = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Quantos meses à mais? ");
        int Meses = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Quantos dias à mais?");
        int Dias = Integer.parseInt(leitura);

        int Total = Anos * 365 + Meses * 30 + Dias;
        JOptionPane.showMessageDialog(null, Total);

    }
}
