package edu.jesus.gaspar.actividades.actividad_2.ui;

import java.util.Scanner;

import edu.jesus.gaspar.actividades.actividad_2.models.Generator;
import edu.jesus.gaspar.actividades.actividad_2.process.NameValidator;

public class CLI {

    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        showMenu();
        int option = scanner.nextInt();scanner.nextLine();

        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Introduce el nombre a verificar");  
                    String nameEntry = scanner.nextLine();
                    if(NameValidator.nameValidator(nameEntry)){
                        System.err.println("Nombre no existente");
                    }
                    break;
                case 2:
                System.out.print("Numeros pares al 100: \n");
                System.out.println(generator.getEven());

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
            Bienvenido, ¿que programa deseas ver?
            1. Comparar nombre
            2. Numeros
            3. Salir
            """);
    }
}
