package edu.jesus.gaspar.actividades.actividad_2.process;

import static edu.jesus.gaspar.actividades.actividad_2.models.Data.namesDefault;

public class NameValidator {

    public static boolean validateName(String name){
    boolean valid = false;
    int index = 0;
    while (!valid && index<namesDefault.length) {
        if(namesDefault[index].equals(name)){
            valid = true;
        }
        index++;
    }
    return valid;
    }
}
