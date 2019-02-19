package br.senac.es;

public class Retangulo {
    /**
     * /
     */
    //- base: float
    public float base;
    //- altura: float
    public float altura;
    
    public float calculaArea(){
        float area = base * altura;
        
        
        return area;
    }
    public float calculaPerimetro(){
        float perimetro = (base*3) + (altura * 2);
        return perimetro;
    }
}
