package br.senac;

import javax.swing.JOptionPane;

public class Exercício20 {

    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite o número da conta: ");
        double conta = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite seu saldo: ");
        double Saldo = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite seu débito: ");
        double Debito = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite seu crédito: ");
        double Credito = Double.parseDouble(leitura);

        double SaldoAtual = Saldo - Debito + Credito;
        if (SaldoAtual < 0) {
            JOptionPane.showMessageDialog(null, "O Saldo da conta " + conta +
                    " é negativo: " + SaldoAtual);
        } else {
            JOptionPane.showMessageDialog(null, "O Saldo da conta " + conta +
                    " é positivo: " + SaldoAtual);
        }

    }
}
