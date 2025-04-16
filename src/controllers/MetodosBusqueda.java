package controllers;
import view.ShowConsole;
import models.Persona;
public class MetodosBusqueda {
    private ShowConsole showConsole = new ShowConsole();
    private Persona[] personas;

    public MetodosBusqueda(Persona[] personas) {
        showConsole = new ShowConsole();
        this.personas = personas;
        showPersonByCode();
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

    public void showPersonByCode(){
        int codeToFinde=showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if (indexPerson != -1) {
            showConsole.showMessage("Posicion: " + indexPerson);
            showConsole.showMessage("Persona encontrada: " + personas[indexPerson]);
        } else {
            showConsole.showMessage("Persona no encontrada.");
        }
    }

}
