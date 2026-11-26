
package com.mycompany.proyectointegrador;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("PROGRAMA VECTORIAL");

        System.out.println("Punto 1");
        System.out.println("Ingrese las coordenadas de x1:");
        float x1 = leer.nextFloat();

        System.out.println("Ingrese las coordenadas de y1:");
        float y1 = leer.nextFloat();

        System.out.println("Punto 2");
        System.out.println("Ingrese las coordenadas de x2:");
        float x2 = leer.nextFloat();

        System.out.println("Ingrese las coordenadas de y2:");
        float y2 = leer.nextFloat();

        // Se calculan los incrementos
        float incrementoX = x2 - x1;
        float incrementoY = y2 - y1;

        // Se calcula la distancia entre los dos puntos
        double distancia = Math.sqrt(
                Math.pow(incrementoX, 2) + Math.pow(incrementoY, 2)
        );

        // Se muestran los resultados
        System.out.printf("Incremento de X: %.2f%n", incrementoX);
        System.out.printf("Incremento de Y: %.2f%n", incrementoY);
        System.out.printf("La distancia es: %.2f%n", distancia);
    }
}
