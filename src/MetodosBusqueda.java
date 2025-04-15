
public class MetodosBusqueda {
    private ShowConsole views = new ShowConsole();
    
    public void busquedaLineal(int[] array, int elemento) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            views.mostrarMensaje("Elemento encontrado en la posicion: ");
        } else {
            views.mostrarMensaje("Elemento no encontrado en el array.");
        }
    }
}
