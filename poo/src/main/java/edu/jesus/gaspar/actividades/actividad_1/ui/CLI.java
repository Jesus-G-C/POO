package edu.jesus.gaspar.actividades.actividad_1.ui;

import java.util.Scanner;

public class CLI {
    
    public static void showMenu(){
        System.out.println("1. Crea nuevo estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("2. Salir");
    }
    
    public void showmessage(String message){
        System.out.println(message);
    }

    public void showerror(String message){
        System.out.println("Error"+message);
    }

    public void showstudents(String[] students){
        for (String student : students){
            System.out.println(student);
        }
    }

    public static void launch(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Crear un nuevo estudiante");
                    break;
                case 2:
                    System.out.println("Listar estudiantes");
                    break;
                case 3:
                    System.out.println("Opcion invalida");
                    break;
            }
            showMenu();
            option = scanner.nextInt();
        }
    }
}
