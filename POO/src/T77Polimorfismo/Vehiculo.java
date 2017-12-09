//Vehiculo.java

/*Referencia: 
*Video en YouTube 77. Programación en Java || POO || Polimorfismo en POO
 */
package T77Polimorfismo;

//Esta es la superclase
public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}
