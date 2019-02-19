package Lista2;

import javax.swing.JOptionPane;

public class Exercício1 {

    public static void main(String[] args) {
        String leitura;

        double compra;
        double venda;

        do {
            leitura = JOptionPane.showInputDialog("Informe o valor de compra da"
                    + " ação.");
            compra = Double.parseDouble(leitura);
        } while (compra < 0);

        do {
            leitura = JOptionPane.showInputDialog("Informe o valor de venda.");
            venda = Double.parseDouble(leitura);
        } while (venda < 0);

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
