package list3;

import javax.swing.JOptionPane;

public class Lista3 {

    public static void main(String[] args) {

        String nomeProcurado;
        String[] listaNomes = new String[10];

        String leitura;

        for (int i = 0; i < 10; i++) {
            leitura = JOptionPane.showInputDialog("Nomes:");
            listaNomes[i] = leitura;
        }

        nomeProcurado = JOptionPane.showInputDialog("Nome procurado: ");

        for (int i = 0; i < 10; i++) {
            if (nomeProcurado.equalsIgnoreCase(listaNomes[i])) {
                JOptionPane.showMessageDialog(null, "ACHEI");
            } else 
                    
                JOptionPane.showMessageDialog(null, "NÃO ACHEI");
            
        }

    }
}

