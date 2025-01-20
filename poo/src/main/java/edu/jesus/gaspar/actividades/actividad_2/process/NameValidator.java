package edu.jesus.gaspar.actividades.actividad_2.process;

import edu.jesus.gaspar.actividades.actividad_2.models.Data;

public class NameValidator {

    public static boolean namevalidator(String nameDefault){
    boolean valid = false;
    int index = 0;
    while (!valid && index<Data.nameDefault.length) {
        if(nameDefault[index].equals(nameDefault)){
            
        }
    }
    return valid;
    }
}
