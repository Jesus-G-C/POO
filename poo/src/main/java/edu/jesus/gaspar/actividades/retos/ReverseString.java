package edu.jesus.gaspar.actividades.retos;


public class ReverseString {

    /**
     * Metodo para leer la palabra default e imprimirla revertida
     * @param args
     */
    public static void main(String[] args){
        String wordOriginal = "Hola mundo";
        String wordReversed = "";

        for (int letter = wordOriginal.length() - 1; letter >= 0; letter--){
            wordReversed += wordOriginal.charAt(letter);
        }

        System.out.println("Palabra orginal: " + wordOriginal);
        System.out.println("Palabra al reves: " + wordReversed);
    }
}
