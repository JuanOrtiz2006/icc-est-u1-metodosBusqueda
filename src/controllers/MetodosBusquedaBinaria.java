package controllers;
import models.Persona;
import view.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] personas;
    private ShowConsole showConsole;
    public MetodosBusquedaBinaria(Persona [] personas) {
        this.personas = personas;
        this.showConsole = new ShowConsole();
        showConsole.showMessage("Metodo Busqueda Binaria");
    }

    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            if (personas[central].getCode() == code) {
                return central; // Persona encontrada
            } else if (personas[central].getCode() < code) {
                bajo = central + 1; // Buscar en la mitad derecha
            } else {
                alto = central - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; // Persona no encontrada
    }

    private int findPersonByName(String name){
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            if (personas[central].getName().equalsIgnoreCase(name)) {
                return central; // Persona encontrada
            } else if (personas[central].getName().equalsIgnoreCase(name)) {
                bajo = central + 1; // Buscar en la mitad derecha
            } else {
                alto = central - 1; // Buscar en la mitad izquierda
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFinde = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if (indexPerson != -1) {
            showConsole.showMessage("Posicion: " + indexPerson);
            showConsole.showMessage("Persona encontrada: " + personas[indexPerson]);
        } else {
            showConsole.showMessage("Persona no encontrada.");
        }
    }
    
    public void showPersonByName() {
        String nameToFinde = showConsole.getName();
        int indexPerson = findPersonByName(nameToFinde);
        if (indexPerson != -1) {
            showConsole.showMessage("Posicion: " + indexPerson);
            showConsole.showMessage("Persona encontrada: " + personas[indexPerson]);
        } else {
            showConsole.showMessage("Persona no encontrada.");
        }
    }
    
}