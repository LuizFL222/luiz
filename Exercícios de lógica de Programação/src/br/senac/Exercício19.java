package br.senac;

import javax.swing.JOptionPane;

public class Exercício19 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o salário do "
                + "funcionário: ");
        double SalarioFixo = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite o valor de suas vendas");
        double TotalVendas = Double.parseDouble(leitura);

        if (TotalVendas < 1500) {
            double SalarioFinal = (TotalVendas * 3 / 100 + TotalVendas)
                    + SalarioFixo;
            JOptionPane.showMessageDialog(null, SalarioFinal);
        } else {
            double comissao = 1500 - TotalVendas;
            double SalarioFinal = (TotalVendas * 3 / 100 + TotalVendas)
                    + (comissao * 5 / 100 + comissao) + SalarioFixo;
            JOptionPane.showMessageDialog(null, SalarioFinal);

        }
    }
}
