/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list3;

import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args) {

        String nomeProcurado;
        String[] listaNomes = new String[20];

        String leitura;

        for (int i = 0; i < 20; i++) {
            leitura = JOptionPane.showInputDialog("Nomes:");
            listaNomes[i] = leitura + leitura;
        }

        nomeProcurado = JOptionPane.showInputDialog("Nome procurado: ");

        for (int i = 0; i < 20; i++) {
            if (nomeProcurado.equalsIgnoreCase(listaNomes[i])) {
                JOptionPane.showMessageDialog(null, "ACHEI");
            } else 
                    
                JOptionPane.showMessageDialog(null, "NÃO ACHEI");
            
        }

    }
}

