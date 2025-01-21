package edu.jesus.gaspar.actividades.actividad_2.process;

import edu.jesus.gaspar.actividades.actividad_2.models.Data;

public class NameValidator {

    public static boolean nameValidator(String namesDefault){
    boolean valid = false;
    int index = 0;
    while (!valid && index<Data.namesDefault.length) {
        if(namesDefault[index].equals(namesDefault)){
            
        }
    }
    return valid;
    }
}
