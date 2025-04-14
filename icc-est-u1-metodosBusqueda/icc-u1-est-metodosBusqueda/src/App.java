public class App {

    metodosBusqueda metodosBusqueda = new metodosBusqueda();
    public static void main(String[] args){
        App app = new App();
        int[] datos = {10, 20, 30, 40, 50};
        int valorABuscar = 30;

        int resultado = app.metodosBusqueda.busquedaLineal(datos, valorABuscar);

        if (resultado != -1) {
            System.out.println("Valor encontrado: " + resultado);
        } else {
            System.out.println("Valor no encontrado.");
        }
    }
}
