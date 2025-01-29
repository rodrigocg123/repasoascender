package com.mycompany.app.repasoascender;

import java.util.*;

public class Ej13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        Double numero1 = entrada.nextDouble();
        System.out.println("Dime el segundo numero: ");
        Double numero2 = entrada.nextDouble();

        boolean numeroCorrecto = false;

        if (numero1 >= 0 && numero1 <= 1) {
            if (numero2 >= 0 && numero2 <= 1) {
                numeroCorrecto = true;
                System.out.println(numeroCorrecto);
            }
        } else if (numero1 < 0 && numero1 > 1 && numero2 < 0 && numero2 > 1) {
            System.out.println(numeroCorrecto);
        } // else if (numero2 < 0 && numero2 > 1) {
        //     System.out.println(numeroCorrecto);
        // }

    }
}
