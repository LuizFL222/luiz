package Lista2;

import javax.swing.JOptionPane;

public class Exercício6 {

    public static void main(String[] args) {
        String leitura;
        double avaliacao1, avaliacao2, media;
        int novo;

        do {
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

            novo = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma nova operação?",
                    "Mensagem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (novo == JOptionPane.YES_OPTION);

    }
}
