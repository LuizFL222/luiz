package br.senac.es;

public class Principal {

    public static void main(String[] args) {
        Retangulo ret;
        ret = new Retangulo();
        ret.base = 10;
        ret.altura = 2;
        
        float resultado = ret.calculaArea();
        
        System.out.println("Área: " + resultado);
        
    }

}
