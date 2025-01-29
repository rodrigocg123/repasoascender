package com.mycompany.app.repasoascender;

import java.util.*;

public class Ej12 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Dime el segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Dime el tercer numero: ");
        int numero3 = entrada.nextInt();
        System.out.println("Dime el cuerto numero: ");
        int numero4 = entrada.nextInt();
        boolean iguales = false;
        if (numero1 == numero2) {
            if (numero2 == numero3) {
                if (numero3 == numero4) {
                    iguales = true;
                }
            }
        }
        if (iguales == true) {
            NumerosIguales();
        } else if (iguales == false) {
            NumeroDiferentes();
        }
    }

    public static void NumerosIguales() {
        System.out.println("¡¡LOS NUMEROS SON IGUALES!!");
    }

    public static void NumeroDiferentes() {
        System.out.println("¡¡LOS NUMEROS SON DISTINTOS!!");
    }
}
