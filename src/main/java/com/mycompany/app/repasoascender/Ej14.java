package com.mycompany.app.repasoascender;

public class Ej14 {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        boolean[][] matriz = new boolean[][] { { t, f, t }, { f, t, f } };
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) { // Iterar por filas
            for (int j = 0; j < matriz[i].length; j++) { // Iterar por columnas
                System.out.print(matriz[i][j] ? "t " : "f" + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
