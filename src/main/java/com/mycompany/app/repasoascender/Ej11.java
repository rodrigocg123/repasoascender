package com.mycompany.app.repasoascender;

public class Ej11 {
    public static void main(String args[]) {
        operacion1();
        operacion2();
        operacion3();
        operacion4();
        operacion5();
        operacion6();
    }

    public static void operacion1() {
        int resultado1 = (101 + 0) / 3;
        System.out.println("(101 + 0) / 3 = " + resultado1);
    }

    public static void operacion2() {
        double resultado2 = (3.0e-6 * 10000000.1);
        System.out.println("(3.0e-6 * 10000000.1) = " + resultado2);
    }

    public static void operacion3() {
        boolean resultado3 = true && true;
        System.out.println("true && true = " + resultado3);

    }

    public static void operacion4() {
        boolean resultado4 = false && true;
        System.out.println("false && true = " + resultado4);
    }

    public static void operacion5() {
        boolean resultado5 = (false && false) || (true && true);
        System.out.println("(false && false) || (true && true) = " + resultado5);
    }

    public static void operacion6() {
        boolean resultado6 = (false || false) && (true && true);
        System.out.println("(false || false) && (true && true) = " + resultado6);
    }
}
