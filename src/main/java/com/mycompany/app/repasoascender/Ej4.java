package com.mycompany.app.repasoascender;

// import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("que numeros quieres multiplicar");
        int numero1 = -5;
        int numero2 = 8;
        int numero3 = 6;
        int numero4 = 55;
        int numero5 = 9;
        int numero6 = 20;
        int numero7 = -3;
        int numero8 = 2;
        int numero9 = 15;
        int numero10 = 5;
        int numero11= 3;

        operacion1(numero1, numero2, numero3);
        operacion2(numero4 , numero5);
        operacion3(numero6, numero7, numero10, numero2);
        operacion4(numero10, numero9, numero11 , numero8, numero2, numero11);
    }

    public static void operacion1(int a , int b ,int c) {
        System.out.println("El resultado de la operacion es = " + (a + b * c));
    }
    public static void operacion2 (int a, int b){
        System.out.println("El resultado de la operacion es = " + ((a + b) % b));
    }
    public static void operacion3 (int a, int b , int c , int d){
        System.out.println("El resultado de la operacion es = " + (a + b * c / d));
    }
    public static void operacion4 (int a , int b , int c , int d , int e ,int f){
        System.out.println("El resultado de la operacion es = " + (a + b / c * d - e % f));
    }
}
