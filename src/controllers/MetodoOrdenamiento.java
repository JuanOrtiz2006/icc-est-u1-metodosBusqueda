package controllers;
import models.Persona;
public class MetodoOrdenamiento {
    Persona [] personas;

    public MetodoOrdenamiento() {
    }
    public void ordenarPorNombre(Persona[] personas) {  
        this.personas = personas;
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getName().compareToIgnoreCase(personas[j + 1].getName()) > 0) {
                    // Intercambiar personas[j] y personas[j + 1]
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorCodigo(Persona[] personas) {
        this.personas = personas;
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getCode() > personas[j + 1].getCode()) {
                    // Intercambiar personas[j] y personas[j + 1]
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
}
