
package com.mycompany.proyectointegrador;

import java.util.Scanner;

public class Financiero {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("PROGRAMA FINANCIERO");

        System.out.print("Ingrese el precio base del equipo: ");
        double precioBase = leer.nextDouble();

        System.out.println("\n--- EVALUACION DE PROPOSICIONES LOGICAS ATOMICAS ---");

        System.out.print("p: ¿El comprador es estudiante acreditado? (1 = Verdadero / 0 = Falso): ");
        int inputP = leer.nextInt();
        boolean p = (inputP == 1);

        System.out.print("q: ¿El equipo es de catálogo educativo? (1 = Verdadero / 0 = Falso): ");
        int inputQ = leer.nextInt();
        boolean q = (inputQ == 1);

        double porcentajeImpuesto;
        String politicaFiscal;

        // Evaluación de las reglas de negocio
        if (p && q) {
            porcentajeImpuesto = 0.00;
            politicaFiscal = "Exención Total de Impuesto (Tasa 0%)";

        } else if (p ^ q) {
            porcentajeImpuesto = 0.08;
            politicaFiscal = "Impuesto Subvencionado / Reducido (Tasa 8%)";

        } else {
            porcentajeImpuesto = 0.16;
            politicaFiscal = "Impuesto General Standard (Tasa 16%)";
        }

        // Cálculos financieros
        double montoImpuesto = precioBase * porcentajeImpuesto;
        double totalPagar = precioBase + montoImpuesto;

        // Mostrar resultados
        System.out.println("\n--- DICTAMEN FISCAL Y FINANCIERO ---");

        System.out.printf("Precio Base del Equipo: $%.2f%n", precioBase);
        System.out.println("Proposición p (Estudiante): " + (p ? "1 (Verdadero)" : "0 (Falso)"));
        System.out.println("Proposición q (Educativo): " + (q ? "1 (Verdadero)" : "0 (Falso)"));
        System.out.println("Política Aplicada: " + politicaFiscal);
        System.out.printf("Monto de Impuesto: $%.2f%n", montoImpuesto);
        System.out.printf("TOTAL FINAL A PAGAR: $%.2f%n", totalPagar);
    }
}
