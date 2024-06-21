package com.betplay;

public class MenuPersonas {


    public static int menuPrincipalAdministradores() {
        System.out.println("----------Bienvenido al sistema de organización para administradores Betplay---------------");
        System.out.println("1. Gestión de Equipos y Jugadores ");
        System.out.println("2. Programación y Resultados de Partidos ");
        System.out.println("3. Gestión de Lesiones y Rendimiento ");
        System.out.println("4. Entrenamientos y Convocatorias");
        System.out.println("5. Transferencias de Jugadores ");
        System.out.println("6. Venta de Entradas y Patrocinios ");
        System.out.println("7. Comunicaciones y Relaciones Públicas ");
        System.out.println("8. Estadísticas y Informes ");
        System.out.println("9. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 9);
        return op;
    }

    public static int menuPrincipalEntrenadores() {
        System.out.println("----------Bienvenido al sistema de organización para entrenadores Betplay---------------");
        System.out.println("1. Gestión de Equipos y Jugadores ");
        System.out.println("2. Programación y Resultados de Partidos ");
        System.out.println("3. Gestión de Lesiones y Rendimiento ");
        System.out.println("4. Entrenamientos y Convocatorias");
        System.out.println("5. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 5);
        return op;
    }

    public static int menuPrincipalJugadores() {
        System.out.println("----------Bienvenido al sistema de organización para jugadores Betplay---------------");
        System.out.println("1. Resultados de Partidos ");
        System.out.println("2. Gestión de Lesiones y Rendimiento ");
        System.out.println("3. Entrenamientos y Convocatorias");
        System.out.println("4. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 4);
        return op;
    }

    public static int menuPrincipalPeriodistas() {
        System.out.println("----------Bienvenido al sistema de organización para periodistas Betplay---------------");
        System.out.println("1. Comunicaciones y Relaciones Públicas ");
        System.out.println("2. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 2);
        return op;
    }

    public static int menuPrincipalAficionados() {
        System.out.println("----------Bienvenido al sistema de organización para aficionados Betplay---------------");
        System.out.println("1. Compra de Entradas ");
        System.out.println("2. Patrocinios de aficionados ");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }
}
