package com.mycompany.app.repasoascender;

import java.util.*;

public class Ej7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el numero que quieres que se imprima su tabla de multiplicar:");
        int numero = entrada.nextInt();
        System.out.println("Tabla de multiplicar: ");
        if (numero >= 0 && numero <= 10) {
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " +  i + " = " + resultado);
            }
        }

    }

    public static void tablaMultiplicar(int a) {

    }
}
