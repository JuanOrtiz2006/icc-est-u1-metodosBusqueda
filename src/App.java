import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.Persona;
import view.ShowConsole;
import java.util.Scanner;
import controllers.MetodoOrdenamiento;
public class App {
    public static void main(String[] args) throws Exception {
        ShowConsole showConsole = new ShowConsole();
        Scanner scanner = new Scanner(System.in);     
        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();
        // Crear una instancia de la clase MetodosBusqueda
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

        //MetodosBusqueda metodosBusqueda = new MetodosBusqueda(personas);
        MetodosBusquedaBinaria metodosBusquedaBinaria = new MetodosBusquedaBinaria(personas);
        //metodosBusquedaBinaria.showPersonByCode();
        
        showConsole.showMenu();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                metodoOrdenamiento.ordenarPorCodigo(personas);
                metodosBusquedaBinaria.showPersonByCode();
                break;
            case 2:
            metodoOrdenamiento.ordenarPorNombre(personas);
            metodosBusquedaBinaria.showPersonByName();
            break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        

    }

}
