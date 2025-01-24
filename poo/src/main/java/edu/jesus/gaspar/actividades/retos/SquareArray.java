package edu.jesus.gaspar.actividades.retos;

import java.util.Arrays;
import java.util.Scanner;

public class SquareArray {

    /**Metodo para preguntar al usuario cuantos numeros desea agregar a la vez que pide que los ingrese
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

        Arrays.sort(numbers);
        System.out.println("\n El arreglo original es: " + Arrays.toString(numbers));
        
        SquareArray.squareArray(numbers);

    }

    public static int squareArray(int[] numbers){
        int[] squareNumbers = numbers;
        for (int i = 0; i < squareNumbers.length; i++){
            squareNumbers[i] = squareNumbers[i] * squareNumbers[i];
        }
        Arrays.sort(squareNumbers);
        System.out.println(" El arreglo al cuadrado es: " + Arrays.toString(squareNumbers));
                return 0;
    }

    @Override
    public String toString() {
        return "SquareArray []";
    }
}
