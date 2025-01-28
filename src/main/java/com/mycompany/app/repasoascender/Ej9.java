package com.mycompany.app.repasoascender;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el numero que quieres: ");
        Double numero = entrada.nextDouble();
        System.out.println("Dime el segundo numero que quieres: ");
        Double numero2 = entrada.nextDouble();
        System.out.println("Dime el tercer numero que quieres: ");
        Double numero3 = entrada.nextDouble();
        System.out.println("Por ultimo, dime el cuarto numero que quieres: ");
        Double numero4 = entrada.nextDouble();
        operacionCompuesta(numero, numero2, numero3 , numero4);
    }
    public static void operacionCompuesta(Double a, Double b , Double c, Double d){
        System.out.println(( a * b - b * b) / (c - d));
    }
}
