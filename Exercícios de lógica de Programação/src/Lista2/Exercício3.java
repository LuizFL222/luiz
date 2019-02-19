package Lista2;

import javax.swing.JOptionPane;

public class Exercício3 {

    public static void main(String[] args) {
        String leitura;

        double compra = 0;
        double venda = 0;

        while (compra <= 0) {
            leitura = JOptionPane.showInputDialog("Informe o valor de compra da"
                    + " ação.");
            compra = Double.parseDouble(leitura);
        }

        while (venda <= 0) {
            leitura = JOptionPane.showInputDialog("Informe o valor de venda.");
            venda = Double.parseDouble(leitura);
        }

        double resultado = venda - compra;

        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Resultado "
                    + "operação:\n\n"
                    + "Lucro = " + resultado);
        } else if (resultado < 0) {
            JOptionPane.showMessageDialog(null, "Resultado da "
                    + "operação:\n\n"
                    + "Perda = " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Resultado da "
                    + "operação:\n\n"
                    + "Zero / zero ");
        }

    }
}
