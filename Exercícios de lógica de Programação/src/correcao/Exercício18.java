package br.senac;

import javax.swing.JOptionPane;

public class Exercício18 {

    public static void main(String[] args) {

        String leitura;

        leitura = JOptionPane.showInputDialog("Digite as horas "
                + "trabalhadas no mês");
        double HorasTrab = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite o salário por hora");
        double SalHora = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite sua base salarial");
        double BaseSal = Double.parseDouble(leitura);
        double HxS = (HorasTrab - 40 + SalHora) + 50 * 0.5;

        if (HorasTrab > 40) {
            double TotalSal = HxS + BaseSal;
            JOptionPane.showMessageDialog(null, " Seu salário mais a hora"
                    + " extra é : " + TotalSal);
        } else {
            JOptionPane.showMessageDialog(null, "Não possui hora extra, "
                    + "portanto o salário a ser recebido é : " + BaseSal);
        }
    }
}
