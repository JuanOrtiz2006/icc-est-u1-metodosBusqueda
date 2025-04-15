package controllers;
import view.ShowConsole;
import models.Persona;
public class MetodosBusqueda {
    private ShowConsole showConsole = new ShowConsole();
    private Persona[] personas;

    public MetodosBusqueda(Persona[] personas) {
        showConsole = new ShowConsole();
        this.personas = personas;
    }

    public int busquedaLineal(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i; 
            }
        }
        return -1;
    }

    public int findPersonByCode(int code){
        int cont=0;
        for (Persona persona : personas) {
            if (persona.getCode() == code) {
                return cont;    
            }
            cont++;
        }
        return -1;
    }

    public void showPersonByCode(int code){
        int codeToFince=showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFince);
        if (indexPerson != -1) {
            showConsole.showMessage("Persona encontrada: " + personas[indexPerson]);
        } else {
            showConsole.showMessage("Persona no encontrada.");
        }
    }
}
