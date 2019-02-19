package correcao;

import javax.swing.JOptionPane;

public class exercicio28 {

    public static void main(String[] args) {
        String leitura;
        double Soma;
        double Desconto;

        leitura = JOptionPane.showInputDialog("Digite"
                + " a quantidade de morangos em KG.");
        double Morango = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite"
                + " a quantidade de maçãs em KG.");
        double Maca = Double.parseDouble(leitura);
        double kg = Morango + Maca;
        if (Morango <= 5 && Maca <= 5) {
            Soma = Morango * 2.50 + Maca * 1.80;
            JOptionPane.showMessageDialog(null, " O valor total de compras foi "
                    + "de : " + Soma);
        } else {
            Soma = Morango * 2.20 + Maca * 1.50;
            JOptionPane.showMessageDialog(null, " O valor total de compras foi "
                    + "de : " + Soma);
        }
        if (Soma > 25 || kg > 8) {
            Desconto = Soma * 0.90;
            JOptionPane.showMessageDialog(null, "Valor da compra com "
                    + "desconto : " + Desconto);
        } else {
            JOptionPane.showMessageDialog(null,Soma);
        }

    }
}
