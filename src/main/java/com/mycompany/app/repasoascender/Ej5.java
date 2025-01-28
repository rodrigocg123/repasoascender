package com.mycompany.app.repasoascender;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer numero: ");
        Scanner entrada = new Scanner(System.in);
        int numero1 =entrada.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Introduce el segundo numero: ");
        int numero2 = entrada2.nextInt();
        Multiplicar(numero1 , numero2);
    }
    public static void Multiplicar(int a ,  int b){
        System.out.println(a * b);
    }
}
