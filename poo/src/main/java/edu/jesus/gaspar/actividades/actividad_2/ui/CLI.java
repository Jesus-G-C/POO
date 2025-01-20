package edu.jesus.gaspar.actividades.actividad_2.ui;

import java.util.Scanner;

import edu.jesus.gaspar.actividades.actividad_2.process.NameValidator;

public class CLI {

    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int option = scanner.nextInt();scanner.nextLine();

        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Introduce el nombre a verificar");  
                    String nameEntry = scanner.nextLine();
                    if(NameValidator.namevalidator(nameEntry)){
                        System.err.println("Nombre no existente");
                    }
                    break;
                case 2:
                System.out.print("Numeros pares al 100: ");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            showMenu();
            option = scanner.nextInt();
        }
    }

    public static void showMenu(){
        System.out.println("""
            Bienvenido, ¿que programa quieres ver?
            1. Comparar nombre
            2. Numeros
            3. Salir
            """);
    }
}
