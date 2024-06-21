package com.betplay;

import java.util.Scanner;

public class FuncionesGestion {
    public static String registrar() {
        Scanner scanner = new Scanner(System.in);
        String nombreRegistrado = null;

        System.out.println("¿Qué desea registrar?");
        System.out.println("1. Jugador");
        System.out.println("2. Equipo");

        int opcion = variables.verificarOpcion("Opción: ", 1, 2);
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del jugador: ");
                String nombre = scanner.nextLine();
                nombreRegistrado = nombre;  // Almacena el nombre registrado

                System.out.print("Ingrese la edad del jugador: ");
                int edad = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer

                System.out.print("Ingrese la posición del jugador: ");
                String posicion = scanner.nextLine();
                
                System.out.print("Ingrese la nacionalidad del jugador: ");
                String nacionalidad = scanner.nextLine();
                
                System.out.print("Ingrese el número de camiseta del jugador: ");
                int numCamiseta = scanner.nextInt();
                scanner.nextLine();  // Clear the buffer
                
                System.out.print("Ingrese el equipo del jugador: ");
                String equipo = scanner.nextLine();
                
                System.out.print("Ingrese las lesiones del jugador (en caso de no tener, salte esta casilla): ");
                String lesiones = scanner.nextLine();

                // Aquí esta el espacio para codificar el sistema de guardado
                System.out.println("Jugador registrado exitosamente.");
                break;
            case 2:
                System.out.print("Ingrese el nombre del equipo: ");
                String nombreEquipo = scanner.nextLine();
                nombreRegistrado = nombreEquipo;  // Almacena el nombre registrado

                System.out.print("Ingrese la ciudad del equipo: ");
                String ciudad = scanner.nextLine();
                
                System.out.print("Ingrese el estadio del equipo: ");
                String estadio = scanner.nextLine();
                
                System.out.print("Ingrese el entrenador del equipo: ");
                String entrenador = scanner.nextLine();

                // Aquí esta el espacio para codificar el sistema de guardado 
                System.out.println("Equipo registrado exitosamente.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();

        return nombreRegistrado;
    }


    public static void editar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué desea registrar?");
        System.out.println("1. Jugador");
        System.out.println("2. Equipo");

        int opcion = variables.verificarOpcion("Opción: ", 1, 2);
        switch (opcion) {
            case 1:
                     System.out.print("Ingrese el nombre del jugador a modificar: ");
                     String  nombreJugador = scanner.nextLine();
                     scanner.nextLine();  // Clear the buffer
                    // Aquí va la lógica para buscar el jugador y mostrar sus datos actuales   
                break;
            case 2:
                    System.out.println("Ingrese el nombre del equipo a buscar:");
                    String  nombreEquipo = scanner.nextLine();
                    // Aqui va la logica de busqueda del  equipo y mostrar sus datos actuales
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void eliminar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué desea registrar?");
        System.out.println("1. Jugador");
        System.out.println("2. Equipo");

        int opcion = variables.verificarOpcion("Opción: ", 1, 2);
        switch (opcion) {
            case 1:
                     System.out.print("Ingrese el nombre del jugador a eliminar: ");
                     String  nombreJugador = scanner.nextLine();
                     scanner.nextLine();  // Clear the buffer
                    // Aquí va la lógica para eliminar el jugador y mostrar sus datos actuales   
                break;
            case 2:
                    System.out.println("Ingrese el nombre del equipo a eliminar:");
                    String  nombreEquipo = scanner.nextLine();
                    // Aqui va la logica para elminar del  equipo 
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();

    }
}
