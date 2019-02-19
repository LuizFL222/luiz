package exercicios;

import javax.swing.JOptionPane;

public class exercicio27 {

    public static void main(String[] args) {
        String leitura;
        int homemMais, homemMenos;
        int mulherMais, mulherMenos;

        leitura = JOptionPane.showInputDialog("Digite"
                + " a idade do primeiro homem");
        int homem1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog(" Digite"
                + " a idade do segundo homem");
        int homem2 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog(" Digite"
                + " a idade da primeira mulher");
        int mulher1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog(" Digite"
                + " a idade da segunda mulher");
        int mulher2 = Integer.parseInt(leitura);
        if (homem1 > homem2) {
            homemMais = homem1;
            homemMenos = homem2;
        } else {
            homemMais = homem2;
            homemMenos = homem1;
        }
        if (mulher1 > mulher2) {
            mulherMais = mulher1;
            mulherMenos = mulher2;
        } else {
            mulherMais = mulher2;
            mulherMenos = mulher1;
        }
       int soma = homemMais + mulherMenos;
       int prod = homemMenos * mulherMais;
       
        JOptionPane.showMessageDialog(null," Homem mais velho + mulher mais nova : " + soma + " e " + prod);

    }
}
