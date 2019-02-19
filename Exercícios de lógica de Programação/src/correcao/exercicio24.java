
package exercicios;

import javax.swing.JOptionPane;


public class exercicio24 {
    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite"
                + " o primeiro valor ");
        Double a = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite"
                + " o segundo valor");
        Double b = Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite"
                + " o terceiro valor");
        Double c = Double.parseDouble(leitura);

        if (a < b + c || b < a + c || c < a + b) {
            JOptionPane.showMessageDialog(null, "Forma um triangulo");
        } else {
            JOptionPane.showMessageDialog(null, " Não forma"
                    + " um triangulo");
        }
        
    
}
}

   