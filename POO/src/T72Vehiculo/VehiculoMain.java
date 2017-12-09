//VehiculoMain.java

package T72Vehiculo;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class VehiculoMain {

    /*Como parámetro tiene un arreglo llamado coches de tipo clase vehículo
    este lo usaremos para manejar los precios*/
    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;

        //De todos lo coches que el usuario tecleo almacenamos el precio del primero
        precio = coches[0].getPrecio();
        //Para i menor a la cantidad de elementos del arreglo
        for (int i = 1; i < coches.length; i++) {
            /*Si precio de coche en la posición i es menor que el primero, cambiar el valor
        de precio por este*/
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                //Guardamos el valor de índice
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        //Crear objeto de tipo clase Scanner 
        Scanner entrada = new Scanner(System.in);
        //Que va a digitar el usuario?
        String marca, modelo;
        float precio;
        int numeroDeVehiculos;
        //Se crea la variable en la que se guardara el índice del carro más barato

        System.out.print("Digite la cantidad de vehiculos: ");
        //Guardar en esta variable lo que digite el usuario
        numeroDeVehiculos = entrada.nextInt();
        //Crear el arreglo con la cantidad de objetos que el usuario ingreso
        Vehiculo coches[] = new Vehiculo[numeroDeVehiculos];

        /*Bucle para tomar los datos, condición de paro i<cantidad de elementos
        que tiene mi arreglo coches*/
        for (int i = 0; i < coches.length; i++) {
            //Se come el salto de línea que se guarda anteriormente en el buffer
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche " + (i + 1) + " :");
            System.out.print("Digite el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Digite la marca: ");
            marca = entrada.nextLine();
            System.out.print("Digite el precio: ");
            precio = entrada.nextFloat();

            //En cada iteración se guardaran los datos en el arreglo coches
            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        /*Se asigna el índice que el método -> indiceCocheMBarato(Vehiculo coches[])
        devolvió, a la variable indiceBarato, como es método estático no hace
        falta crear un objeto y se le envía el arreglo coches */
        int indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es:");
        //Se manda a llamar metodo mostrar
        System.out.println(coches[indiceBarato].mostrar());
    }

}
