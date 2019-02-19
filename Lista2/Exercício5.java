package Lista2;

import javax.swing.JOptionPane;

public class Exercício5 {

    public static void main(String[] args) {
        String leitura;
        double avaliacao1, avaliacao2, media;

        do {
            leitura = JOptionPane.showInputDialog("Digite a nota da 1º avaliação");
            avaliacao1 = Double.parseDouble(leitura);
        } while (avaliacao1 < 0 || avaliacao1 > 10);

        do {
            leitura = JOptionPane.showInputDialog("Digite a nota da 2º avaliação");
            avaliacao2 = Double.parseDouble(leitura);
        } while (avaliacao2 < 0 || avaliacao2 > 10);

        media = (avaliacao1 + avaliacao2) / 2;

        JOptionPane.showMessageDialog(null, media);
    }
}
