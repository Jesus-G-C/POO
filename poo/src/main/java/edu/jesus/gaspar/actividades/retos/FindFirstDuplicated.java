package edu.jesus.gaspar.actividades.retos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindFirstDuplicated {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palabra:");
        String word = scanner.nextLine();
        scanner.close();

        int duplicated = fisrtDuplicated(word);

        if(duplicated == -1){
            System.out.println("No se encuentran letras duplicadas");
        }

        else {
            System.out.println("La primer letra duplicada es: " + word.charAt(duplicated) + " en la posicion: " + (duplicated));
        }
    }

    public static int fisrtDuplicated(String word){
        Set<Character> letter = new HashSet<>();

        for (int letterCount = 0; letterCount < word.length(); letterCount++){
            char w = word.charAt(letterCount);

            if (letter.contains(w)){
                return letterCount;
            } else {
                letter.add(w);
            }
        }
        return -1;
    }
}
