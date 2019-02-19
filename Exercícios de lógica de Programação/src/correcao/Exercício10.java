package correcao;

import javax.swing.JOptionPane;

public class Exercício10 {

    public static void main(String[] args) {
        String leitura;

        leitura = JOptionPane.showInputDialog("Qual é o custo de fábrica do "
                + "automóvel? ");

        double cFab = Double.parseDouble(leitura);

        double cDist = cFab * 28.00 / 100.00;

        double cImposto = cFab * 45.00 / 100.00;

        double cTotal = cFab + cDist + cImposto;

        JOptionPane.showMessageDialog(null, "O custo total é: " + cTotal);

    }
}
