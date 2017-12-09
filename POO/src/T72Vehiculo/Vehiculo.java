//Vehiculo.java

/*Referencia: 
*Video en YouTube 72. Programación en Java || POO || Ejercicio - Encontrar el vehículo más barato
 */
package T72Vehiculo;

/*
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados
    por su marca, modelo y precio, imprima las propiedades del vehículo más barato. 
    Para ello, se deberán leer por el teclado las características de cada vehículo 
    y crear una clase que represente a cada uno de ellos
 */
public class Vehiculo {

    String marca;
    String modelo;
    float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrar() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio + "\n";
    }

}
