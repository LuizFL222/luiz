package br.senac.es;

import javax.swing.JOptionPane;

public class Quest3 {

    public static void main(String[] args) {
        String leitura;
        double numAcoes;
        double valorVenda;
        double valorCompra;
        double totalCompra;
        double totalVenda;
        int result;

        do{
        do {
            leitura = JOptionPane.showInputDialog("Digite o número de ações que já obtém");
            numAcoes = Double.parseDouble(leitura);
            if (numAcoes <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido! ");
            }

        } while (numAcoes <= 0);

        do {
            leitura = JOptionPane.showInputDialog("Digite o valor de compra de ações");
            valorCompra = Double.parseDouble(leitura);
            if (valorCompra <= 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido! ");
            }

        } while (valorCompra <= 0);

        do {
            leitura = JOptionPane.showInputDialog("Digite o valor de ações a serem vendidas");
            valorVenda = Double.parseDouble(leitura);
            if (valorVenda < 0) {
                JOptionPane.showMessageDialog(null, "Valor inválido! ");
            }

        } while (valorVenda < 0);

        totalCompra = numAcoes * valorCompra;
        JOptionPane.showMessageDialog(null, totalCompra);

        totalVenda = numAcoes * valorVenda;
        JOptionPane.showMessageDialog(null, totalVenda);
        if (totalVenda < totalCompra) {
            JOptionPane.showMessageDialog(null, "Perda!");
        } else if (totalVenda > totalCompra) {
            JOptionPane.showMessageDialog(null, "Lucro!");
        } else {
            JOptionPane.showMessageDialog(null, "Zero a Zero.");
            
           
            
	result = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação", "Mensagem",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        }while(result = JOptionPane.YES_NO_OPTION);
        }
    }
}