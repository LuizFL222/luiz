
package exercicios;

import javax.swing.JOptionPane;


public class exercicio25 {
    public static void main(String[] args) {
        String leitura;
        String a;
        String b;
        a = JOptionPane.showInputDialog(" Digite o nome"
                + " do primeiro time");
        
        leitura = JOptionPane.showInputDialog(" Digite o número de"
                + " gols marcados por ele"); 
        int gol1 = Integer.parseInt(leitura);
        b = JOptionPane.showInputDialog(" Digite o nome"
                + " do segundo time");
        leitura = JOptionPane.showInputDialog(" Digite o número de"
                + " gols marcados por ele");
        int gol2 = Integer.parseInt(leitura);
        if (gol1 > gol2){
            JOptionPane.showMessageDialog(null," O vencedor foi o time : " + a);}
        else if (gol2 > gol1){
            JOptionPane.showMessageDialog(null," O time vencedor foi : " + b);
        }
        else {
        JOptionPane.showMessageDialog(null,"Empate" );}
        
        
        
        
    }
    
}
