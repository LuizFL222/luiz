package correcao;

import javax.swing.JOptionPane;

public class Exercício11 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Digite o valor ganho por cada"
                + " carro vendido: ");
        float ValorVendas = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite o salário fixo: ");
        float salarioFixo = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite a quantidade de carros vendidos: ");
        float QuantCarrosVendidos = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Digite o valor da comissão: ");
        float comissao = Float.parseFloat(leitura);

        float SalarioFinal = salarioFixo + comissao * QuantCarrosVendidos + (ValorVendas * 5 / 100);

        JOptionPane.showMessageDialog(null, SalarioFinal);

    }
}
