package br.senac.es;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {

        String mensagem = "Qual questão deseja testar?\n\n"
                + "Digite 1 para testar a Questão 1\n"
                + "Digite 2 para testar a Questão 2\n"
                + "Digite 3 para testar a Questão 3\n"
                + "Digite 4 para testar a Questão 4\n"
                + "Digite Extra1 para testar a Extra 1\n"
                + "Digite Extra2 para testar a Extra 2\n"
                + "Digite Sair para encerrar o programa\n";

        String leitura;

        do {

            leitura = JOptionPane.showInputDialog("Qual questão deseja testar?");

            switch (leitura) {
                case "1":
                    Quest1.main(args);
                    break;
                case "2":
                    Quest2.main(args);
                    break;
                case "3":
                    Quest3.main(args);
                    break;
                case "4":
                    Quest4.main(args);
                    break;
                case "Extra1":
                    Extra1.main(args);
                    break;
                case "Extra2":
                    Extra2.main(args);
                    break;
                case "Sair":                    
                case "sair":
                    System.out.println("Encerrando programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha apenas uma das opções mostradas");
            }
        } while (!leitura.equalsIgnoreCase("Sair"));

    }

}
