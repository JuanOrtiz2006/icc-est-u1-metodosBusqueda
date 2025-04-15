import controllers.MetodosBusqueda;

public class App {
    public static void main(String[] args) throws Exception {

        // Crear una instancia de la clase MetodosBusqueda
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        
        // Crear un array de ejemplo
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Realizar una búsqueda lineal
        metodosBusqueda.busquedaLineal(array, 5);
    }

}
