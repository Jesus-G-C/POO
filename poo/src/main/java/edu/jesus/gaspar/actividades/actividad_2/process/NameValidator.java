package edu.jesus.gaspar.actividades.actividad_2.process;

import static edu.jesus.gaspar.actividades.actividad_2.models.Data.namesDefault;

public class NameValidator {

    /**
     * Metodo para validar nombres existentes predeterminados
     * @param name variable con la que hace la comparacion
     * @return regresa un valor booleano para validar la comparacion
     */
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
