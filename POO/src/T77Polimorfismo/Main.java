//Main.java

package T77Polimorfismo;

/**
 *
 * @author Javier
 */
public class Main {

    /*Polimorfismo: Un objeto de la superclase pueda almacenar un objeto de cualquiera
    de sus subclases, en otras palabras las muchas formas que puede tomar un objeto 
    dependiendo del contexto donde lo utilices*/
    public static void main(String[] args) {
        //Se crea un arreglo de 4 vehiculos
        Vehiculo misVehiculos[] = new Vehiculo[4];

        //Se agrega el primer vehiculo
        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        /*En este arreglo almacenamos un objeto de tipo VehiculoTurismo(Subclase) al arreglo 
    tipo Vehiculo(Superclase)
                         PARA ESTO SIRVE EL POLIMORFISMO!!                  */
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45GH", "Toyota", "KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "J18", "Toyota", "J9");

        //Mostrar todos los datos del arreglo de objetos
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }

}
