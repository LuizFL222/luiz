package br.senac;

import javax.swing.JOptionPane;

public class Exercício28 {

    public static void main(String[] args) {
        String leitura;
        double Soma, Desconto, Morango, Maca, KG;

        leitura = JOptionPane.showInputDialog("Digite"
                + " a quantidade em KG de morangos");
        Morango = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite"
                + " a quantidade em KG de maçãs");
        Maca = Double.parseDouble(leitura);

        KG = Morango + Maca;

        if (Morango <= 5 && Maca <= 5) {
            Soma = Morango * 2.50 + Maca * 1.80;
            JOptionPane.showMessageDialog(null, "Valor total comprado: " + Soma);
        } else {
            Soma = Morango * 2.20 + Maca * 1.50;
            JOptionPane.showMessageDialog(null, "Valor total comprado: " + Soma);
        }
        if (Soma > 25 || KG > 8) {
            Desconto = Soma * 0.90;
            JOptionPane.showMessageDialog(null, "Valor já descontado: "
                    + Desconto);
        } else {
            JOptionPane.showMessageDialog(null, +Soma);
        }

    }
}
