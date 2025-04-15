package view;
import java.util.Scanner;
public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Metodo Busqueda");
        
    }

    public int getCode(){
        System.out.println("Ingrese codigo: ");
        int code = scanner.nextInt();
        System.out.println("El codigo ingresado es: " + code);
        return code;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    
}
