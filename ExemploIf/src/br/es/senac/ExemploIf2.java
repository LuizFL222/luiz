package br.es.senac;

public class ExemploIf2 {

    public static void main(String[] args) {
        boolean logica = true; //ou false

        if (10 < 11 == true) {
            System.out.println("VERDADE");
        }

        if (true == false) {
            System.out.println("Não vai"
                    + " executar");
        }

        if (false == false) {
            System.out.println("Vai ser executado");
        }

        if (true) {
            System.out.println("Com certeza vai ser executado");
        }
    }

}
