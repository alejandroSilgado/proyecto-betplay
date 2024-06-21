package com.betplay;

public class Submenus {
    public static int menu1() {
        System.out.println("1. Registrar");
        System.out.println("2. Editar");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 4);
        return op;
    }

    public static int menu2() {
        System.out.println("1. Programar partidos");
        System.out.println("2. Registrar resultados partidos");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }

    public static int menu3() {
        System.out.println("1. Registar lesiones ");
        System.out.println("2. Seguimiento de rendimiento");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }

    public static int menu4() {
        System.out.println("1. Registar sesiones de entrenamiento");
        System.out.println("2. Gestión de nombramientos para partidos");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }

    public static int menu5() {
        System.out.println("1. Transferencias de jugadores");
        System.out.println("2. Listar transferencias");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }

    public static int menu6() {
        System.out.println("1. Venta de entradas");
        System.out.println("2. Gestor de patrocinios");
        System.out.println("3. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 3);
        return op;
    }

    public static int menu7() {
        System.out.println("1. Crear anuncio ");
        System.out.println("2. Listar anuncios creados");
        System.out.println("3. Eliminar anuncio ");
        System.out.println("4. Salir");

        int op = variables.verificarOpcion("Opción: ", 1, 4);
        return op;
    }
}
