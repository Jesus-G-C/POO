package edu.jesus.gaspar.actividades.actividad_1.ui;

import java.util.Scanner;

import edu.jesus.gaspar.actividades.actividad_1.process.StockManager;

public class CLI {
    
    public static void showMenu(){
        System.out.println("""
            Menu
            1. Crear estudiante
            2. Listar
            3. Salir
            """);
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void showError(String message){
        System.out.println("Error"+message);
    }

    public void showStudents(String[] students){
        for (String student : students){
            System.out.println(student);
        }
    }

    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        int option = scanner.nextInt();
        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Introduce el numero de puertas");
                    int numPuertas = scanner.nextInt();scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color = scanner.nextLine();
                    System.out.println("Introduce el modelo");  
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca = scanner.nextLine();

                    break;
                case 2:
                    stockManager.printStock();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            showMenu();
            option = scanner.nextInt();
        }
    }
}
