package com.mycompany.app.repasoascender;

public class Ej15 {
    public static void main(String[] args) {
        int matriz[][]  = new int[][]{{10,20,30} , {40,50,60}};
        
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) { // Iterar por filas
            for (int j = 0; j < matriz[i].length; j++) { // Iterar por columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        // Crear la matriz transpuesta
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
