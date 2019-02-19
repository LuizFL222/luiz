package ExArray;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        String leitura;
        int[] nota;
        nota = new int[10];
        double soma = 0;
        int i = 0;
        double div = 0;

        while (i < 10) {
            leitura = JOptionPane.showInputDialog("Digite sua nota " + (i + 1));
            nota[i] = Integer.parseInt(leitura);
            soma = (soma + nota[i]);
            div = soma / 10;

            i++;
        }

        JOptionPane.showMessageDialog(null, "Média: \n" + div);
    }
}
