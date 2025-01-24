package edu.jesus.gaspar.actividades.retos;

import java.util.Scanner;

public class FindSmallerValue {

    /**
     * Metodo para agarrar los valores del usuario y crear un arreglo con dichos valores
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos numeros desea ingresar? ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Ingrese el valor numero " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close(); 
        int minimum = findMinimum(numbers);
        System.out.println("El valor mas pequeño es: " + minimum);
    }

    /**
     * Metodo para buscar y retornar el valor mas pequeño del arreglo
     * @param arg
     * @return regresa el valor mas pequeño encontrado
     */
    public static int findMinimum(int[] arg) {
        if (arg == null || arg.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío o es nulo.");
        }

        int mini = arg[0];
        for (int i = 1; i < arg.length; i++) {
            if (arg[i] < mini) {
                mini = arg[i];
            }
        }
        return mini;
    }
}