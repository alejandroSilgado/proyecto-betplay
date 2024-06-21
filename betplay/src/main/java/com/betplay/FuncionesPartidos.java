package com.betplay;
import java.util.Scanner;
public class FuncionesPartidos {
    public static void programar() {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Ingrese el nombre del partido ");
        String nombrePartido = scanner.nextLine();

        System.out.println("Ingrese el nombre de los equipos que van a jugar");
        System.out.println("________________________________________________");

        System.out.print("Equipo local: ");
        String equipoLocal = scanner.nextLine();

        System.out.print("Equipo visitante: ");
        String equipoVisitante = scanner.nextLine();

        System.out.print("Hora del partido: ");
        String horaPartido = scanner.nextLine();

        System.out.print("Fecha del partido: ");
        String fechaPartido = scanner.nextLine();

        System.out.print("Estadio para el partido: ");
        String nombreEstadio = scanner.nextLine();
        //Aqui va el sistema de guardado de datos en la base de datos

        scanner.close();
    }   
    public static void registrar() {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Ingrese el nombre del partido al que va a subir las estadisticas: ");
        String nombrePartidoBuscar = scanner.nextLine();

        if  (nombrePartidoBuscar.equals("nombrePartido")) {
            System.out.print("Goles del paido: ");
            int goles = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tarjetas del partido ");
            System.out.print("Rojas: ");
            int tarjetasRojas = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Amarillas: ");
            int tarjetasAmarillas = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Incidentes del partido: ");
            String incidentesPartido = scanner.nextLine();

            System.out.print("Resultado del partido: ");
            String resultadoPartido = scanner.nextLine();

        }else {
            System.out.println("No se encontro el partido");
        }

        scanner.close();

        //Aqui va el sistema de guardado de datos en la base de datos
    }

}
