package br.senac;

import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {

        String leitura;

        leitura = JOptionPane.showInputDialog("A");
        int a = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("B");
        int b = Integer.parseInt(leitura);

        leitura = JOptionPane.showInputDialog("C");
        int c = Integer.parseInt(leitura);

        if ((a < b) && (b < c)) {
            System.out.println("A B C : " + a + " " + b + " " + c);
        } else if ((a < c) && (c < b)) {
            System.out.println("A C B : " + a + " " + c + " " + b);
        } else if ((b < a) && (a < c)) {
            System.out.println("B A C : " + b + " " + a + " " + c);
        } else if ((b < c) && (c < a)) {
            System.out.println("B C A : " + b + " " + c + " " + a);
        } else if ((c < a) && (a < b)) {
            System.out.println("C A B : " + c + " " + a + " " + b);
        } else {
            System.out.println("C B A : " + c + " " + b + " " + a);
        }

    }
}
