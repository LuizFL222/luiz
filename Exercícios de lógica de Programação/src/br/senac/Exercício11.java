package br.senac;

import javax.swing.JOptionPane;

public class Exercício11 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o valor ganho por cada"
                + " carro vendido: ");
        float ValorVendas = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite o salário fixo: ");
        float salarioFixo = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite a quantidade de carros "
                + "vendidos: ");
        float QuantCarrosVendidos = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite o valor total de carros "
                + "vendidos: ");
        float comissao = Float.parseFloat(leitura);

        float SalarioFinal = salarioFixo + ValorVendas * QuantCarrosVendidos
                + (comissao * 5 / 100);

        JOptionPane.showMessageDialog(null, SalarioFinal);

    }
}
