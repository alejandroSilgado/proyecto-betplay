package com.betplay;

public class Main {
    public static class ProgramadorPartidos {
        public static void partidos() {
            int op = Submenus.menu2();

            if (op == 1) {
                FuncionesPartidos.programar();
            }else if (op == 2) {
                FuncionesPartidos.registrar();
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    public static class GestorEquipos {
        public static void gestor() {
            int op = Submenus.menu1();

            if (op == 1) {
                FuncionesGestion.registrar();
            } else if (op == 2) {
                FuncionesGestion.editar();
            } else if (op == 3) {
                FuncionesGestion.eliminar();
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }


    public static void main(String[] args) {
        while (true) {
            int op = MenuPersonas.menuPrincipalAdministradores();
            switch (op) {
                case 1:
                    GestorEquipos.gestor();
                    break;
                case 2:
                    ProgramadorPartidos.partidos();
                    break;
                case 3:
                    Submenus.menu3();
                    break;
                case 4:
                    Submenus.menu4();
                    break;
                case 5:
                    Submenus.menu5();
                    break;
                case 6:
                    Submenus.menu6();
                    break;
                case 7:
                    Submenus.menu7();
                    break;
                case 8:
                    // Llamar al método correspondiente para la opción 8
                    break;
                case 9:
                    System.out.println("Saliendo");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
