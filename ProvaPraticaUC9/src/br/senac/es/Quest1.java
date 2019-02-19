
package br.senac.es;

import javax.swing.JOptionPane;


public class Quest1 {
    public static void main(String[] args) {
        String leitura;
        
        leitura = JOptionPane.showInputDialog("Digite o valor A: ");
        double A = Integer.parseInt(leitura);
        
        leitura = JOptionPane.showInputDialog("Digite o valor B: ");
        double B = Integer.parseInt(leitura);
        
        double div = A / B;
        
        JOptionPane.showMessageDialog(null,"O resultado é: " + div);
    }
}
