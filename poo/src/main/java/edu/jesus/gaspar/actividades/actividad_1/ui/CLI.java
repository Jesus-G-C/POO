package edu.jesus.gaspar.actividades.actividad_1.ui;

import java.util.Scanner;

import edu.jesus.gaspar.actividades.actividad_1.process.StockManager;

public class CLI {

    /**
     * Este metodo es la intefaz con el usuario, al pedirle datos y almacenarlos para la creacion del carro
    */
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        showMenu();
        int option = scanner.nextInt();scanner.nextLine();

        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Introduce el numero de puertas");
                    int numeroPuertas = scanner.nextInt();scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color = scanner.nextLine();
                    System.out.println("Introduce el modelo(Year)");  
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca = scanner.nextLine();
                    stockManager.addCar(modelo, marca, numeroPuertas, color);
                    break;
                case 2:
                System.out.print("El catologo actual es: ");
                System.out.println(stockManager.getStock() + "\n");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            showMenu();
            option = scanner.nextInt();
        }
    }

    /**
     * Este metodo crea el menu interactivo con el usuario
    */
    public static void showMenu(){
        System.out.println("""
            Menu
            1. Agregar carro al catalogo
            2. Mostrar catalogo
            3. Salir
            """);
    }
}
