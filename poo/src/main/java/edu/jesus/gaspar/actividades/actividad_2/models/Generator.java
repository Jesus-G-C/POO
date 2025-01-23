package edu.jesus.gaspar.actividades.actividad_2.models;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    /**
     * Metodo para generar numeros pares del 0 al 100
     * @return regresa todos los numeros pares
     */
    public List <Integer>getEven(){
        List<Integer> even = new ArrayList<>();
        for (int number = 0; number <= 100; number +=2){
            even.add(number);
        }
        return even;
 }
}