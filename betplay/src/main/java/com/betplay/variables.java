package com.betplay;

import java.util.Scanner;

public class variables {
    public static int verificarOpcion(String mensaje, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= min && opcion <= max) {
                    break;
                } else {
                    System.out.println("Por favor, elija una opción válida entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
                scanner.next(); // clear the invalid input
            }
        }
        scanner.close();
        return opcion;
    }
}
