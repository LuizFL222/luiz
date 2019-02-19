package br.es.senac;

public class ExemploIf1 {

    public static void main(String[] args) {
        int a = 5 * 2;

        if (a > 10) {
            System.out.println("A variável 'a' é maior"
                    + " que 10");
        } else if (a < 10) {
            System.out.println("A variável 'a' é menor"
                    + " que 10");
        } else {
            System.out.println("A variável 'a' é igual"
                    + " a 10");
        }

    }
}
