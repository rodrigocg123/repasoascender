package com.mycompany.app.repasoascender;

public class Ej10 {
    public static void main(String[] args) {
        Double numero= 4.0;
        int numero1= 1;
        Double numero2= 1.0;
        int numero3= 3;
        int numero4= 5;
        int numero5= 7;
        int numero6= 9;
        int numero7= 11;
        formula(numero,numero1,numero2,numero3,numero4,numero5,numero6,numero7);


    }
    public static void formula(Double a , int b , Double c ,int d, int e, int f, int g,int h){
        double resultado = 0;
        resultado = (a * (b - (c / d) + (c / e) - (c/f) + (c/g) - (c/h)));
        System.out.println(resultado);
    }
}
