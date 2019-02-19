package br.senac;

import javax.swing.JOptionPane;

public class Exercício9 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Salário mensal");
        double salario = Double.parseDouble(leitura);

        leitura = JOptionPane.showInputDialog("Digite a porcentagem do reajuste");
        double reajuste = Double.parseDouble(leitura);

        double ValorTotal;
        ValorTotal = salario + reajuste / 100.00 * salario;
        JOptionPane.showMessageDialog(null,"Curta seu novo salário!!\n" + ValorTotal);

    }
}
