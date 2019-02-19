package br.es.senac;

import javax.swing.JOptionPane;

public class ExemploIf3 {

    public static void main(String[] args) {
        //Exemplos de 'ifs' aninhados
        String sexo = JOptionPane.showInputDialog("Você é "
                + "Homem ou Mulher?");

        if (sexo.equals(Homem)) {

            String leitura = JOptionPane.showInputDialog(""
                    + "Digite um número inteiro");
            int num = Integer.parseInt(leitura);
            //usando o operador '%'
            if (num % 2 == 0) {
                //null - para centralizar na tela
                JOptionPane.showMessageDialog(null, "Você digitou"
                        + " um número par");
            } else {
                JOptionPane.showMessageDialog(null, "Você digitou um número ímpar");
            }
        } else if (sexo.equals("Mulher")) {
            String leitura = JOptionPane.showInputDialog("Você já tem filhos, Sim ou Não ?");

            if (leitura.equalsIgnoreCase(null, "É mamãe!")) {
              
            }
        } else {
            System.out.println("Não vamos falar sobre isso");
        }
    }

}
