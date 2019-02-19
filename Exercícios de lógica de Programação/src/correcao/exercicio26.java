
package exercicios;

import javax.swing.JOptionPane;


public class exercicio26 {
    public static void main(String[] args) {
        String leitura;
        leitura = JOptionPane.showInputDialog("Digite o primeiro valor");
        Double valor1= Double.parseDouble(leitura);
        leitura = JOptionPane.showInputDialog("Digite o segundo valor");
        Double valor2= Double.parseDouble(leitura);
        if (valor1 > valor2){
            JOptionPane.showMessageDialog(null," O primeiro valor é maior " + valor1);}
        else if (valor1 < valor2){
        JOptionPane.showMessageDialog(null," O segundo valor é maior : " + valor2);}
        else  {
        JOptionPane.showMessageDialog(null," Número iguais ");}
    }
}
