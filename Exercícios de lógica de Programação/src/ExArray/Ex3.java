package ExArray;

import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {

        do{
        String leitura;
        int[] nota;
        nota = new int[10];
        double soma = 0;
        int i = 0;
        double div = 0;

        do {
            leitura = JOptionPane.showInputDialog("Digite sua nota " + (i + 1));
            nota[i] = Integer.parseInt(leitura);
            if (nota[i] > 10 || nota[i] < 0) {
                JOptionPane.showMessageDialog(null, "Digite um valor maior que 0 e menor que 10");
            } else {
                soma = (soma + nota[i]);
                div = soma / 10;

                i++;
            }
        } while (i < 10);

        JOptionPane.showMessageDialog(null, "Média: \n" + div);
        }while
    }
}
