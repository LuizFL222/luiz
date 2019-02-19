package br.senac;

import javax.swing.JOptionPane;

public class Exercício27 {

    public static void main(String[] args) {
        String leitura;
        int MenMa, MenMe, WomanMa, WomanMe, H1, H2, M1, M2,Soma,Prod;

        leitura = JOptionPane.showInputDialog("Qual é a idade do primeiro "
                + "homem?");
        H1 = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Qual é a idade do segundo "
                + "homem?");
        H2 = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Qual é a idade da primeira "
                + "mulher?");
        M1 = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("Qual é a idade da segunda "
                + "mulher?");
        M2 = Integer.parseInt(leitura);

        if (H1 > H2) {
            MenMa = H1;
            MenMe = H2;
        } else {
            MenMa = H2;
            MenMe = H1;
        }

        if (M1 > M2) {
            WomanMa = M1;
            WomanMe = M2;
        } else {
            WomanMa = M2;
            WomanMe = M1;
        }

        Soma = MenMa + WomanMe;
        Prod = MenMe * WomanMa;

        JOptionPane.showMessageDialog(null, " Homem mais velho + mulher mais "
                + "nova : " + Soma + " e " + Prod);

    }
}
