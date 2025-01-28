package com.mycompany.app.repasoascender;

import java.util.*;

public class Ej6 {
    public static void main(String[] args) {
        System.out.println("Dime el primer numero: ");
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        System.out.println("Dime el segundo numero: ");
        Scanner entrada2= new Scanner(System.in);
        int numero2 = entrada2.nextInt();
        int resultadosuma=0;
        int resultadoresta=0;
        int resultadomultiplicacion=0;
        int resultadodivision=0;
        int resultadoresto=0;

        resultadosuma= suma(numero1 , numero2);
        System.out.println(numero1 + " + " + numero2 + " = " +resultadosuma);
        resultadoresta=resta(numero1, numero2);
        System.out.println(numero1 + " - " + numero2 + " = " +resultadoresta);
        resultadomultiplicacion=multiplicacion(numero1 ,numero2);
        System.out.println(numero1 + " * " + numero2 + " = " +resultadomultiplicacion);
        resultadodivision=division(numero1, numero2);
        System.out.println(numero1 + " / " + numero2 + " = " +resultadodivision);
        resultadoresto=division(numero1, numero2);
        System.out.println("el resto de " + numero1 +" y "+ numero2 + " = " +resultadoresto);
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1 , int numero2){
        return numero1 * numero2;
    }

    public static int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static int resto(int numero1, int numero2) {
        return numero1 % numero2;
    }
}
