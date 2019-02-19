package br.es.senac.principal;

import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) {
        System.out.println("Sua média");
        String leitura;
        
        leitura = JOptionPane.showInputDialog("Digite a nota 1");
        double nota1 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a nota 2");
        double nota2 = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite a nota 3");
        double nota3 = Double.parseDouble(leitura);
       
        double media = (nota1 + nota2 + nota3) /3;
        System.out.println("Média = " + media);
        JOptionPane.showMessageDialog(null, "Resultado: " + media);
    }
}
