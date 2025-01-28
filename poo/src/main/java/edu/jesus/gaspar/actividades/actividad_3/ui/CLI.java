package edu.jesus.gaspar.actividades.actividad_3.ui;

import java.util.Scanner;

import edu.jesus.gaspar.actividades.actividad_3.models.Product;
import edu.jesus.gaspar.actividades.actividad_3.process.ProductManager;

public class CLI {

    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        showMenu();
        int option = scanner.nextInt();scanner.nextLine();

        while (option != 3){
            switch (option){
                case 1:
                    System.out.println("Los modelos disponibles uno contra otro:");  
                    formatProduct(Product product);
                    ProductManager.cheaperProduct(Product product[]);
                        
                    break;

                case 2:
                System.out.print("Ingrese el nombre del producto: \n");
                String name = scanner.nextLine();
                System.out.print("Ingrese el precio del producto: \n");
                double price = scanner.nextDouble();
                double beforeTax = price + (price*.20);
                double afterTax = beforeTax + (beforeTax*.162);
                productManager.addProduct(name, price, beforeTax, afterTax);

                    break;

                default:
                    System.out.println("Opcion invalida");
            }
            showMenu();
            option = scanner.nextInt();scanner.nextLine();
        }
    }

    /**
     * Imprime el texto del menu que el usuario va ver de primera mano
     */
    public static void showMenu(){
        System.out.println("""
            \n Bienvenido, ¿Que desea hacer?
            1. Comparar modelos 
            2. Agregar modelo 
            3. Salir
            """);
    }

    public static void formatProduct(Product product){
        System.out.println("\n" +
                    "modelo ='" + product.getName() + '\'' +
                    ", precio ='" + product.getPrice() + '\'' +
                    ", Antes de impuestos ='" + product.getBeforeTax() + '\'' +
                    ", Después de impuestos ='" + product.getAfterTax() + '\'' );
    }
}