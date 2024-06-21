package com.betplay;
import java.util.Scanner;

public class FuncionesLesiones {
        public static void registrarLesion(){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del miembro del equipo para registrar la lesion: ");
        String nombreMiembro = scanner.nextLine();

        String nombreRegistrado = FuncionesGestion.registrar();

        if (nombreMiembro.equals(nombreRegistrado)){
            System.out.println("Ingrese la descripcion de la lesion: ");
            String descripcionLesion = scanner.nextLine();
            
            System.out.println("Ingrese la fecha de la lesion (dd/mm/aaaa): ");
            String fechaLesion = scanner.nextLine();
            
            System.out.println("Ingrese el tiempo estimado de recuperacion (en dias): ");
            int tiempoRecuperacion = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Lesion registrada exitosamente para " + nombreMiembro + ".");
    }else {
        System.out.println("El miembro del equipo con el nombre "+ nombreMiembro+ "No existe en la base de datos");
    }
    scanner.close(); 
  }
}

