import controllers.metodosBusqueda;
import controllers.models.Person;

public class App {
    public static void main(String[] args){
        Person[] personas = new Person[7];
        personas[0] = new Person(101, "Juan");
        personas[1] = new Person(102, "Maria");
        personas[2] = new Person(103, "Carlos");
        personas[3] = new Person(104, "Ana");
        personas[4] = new Person(105, "Luisa");
        personas[5] = new Person(106, "Sofia");
        personas[6] = new Person(107, "Pedro");
        metodosBusqueda metodosBusqueda = new metodosBusqueda(personas);
        /*App app = new App();
        int[] datos = {10, 20, 30, 40, 50};
        int valorBuscar = 30;

        int resultado = app.metodosBusqueda.busquedaLineal(datos, valorBuscar);

        if (resultado != -1) {
            System.out.println("Valor encontrado: " + resultado);
        } else {
            System.out.println("Valor no encontrado.");
        }*/
    }
}
