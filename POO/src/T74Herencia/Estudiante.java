//Estudiante.java

/*Referencia: 
*Video en YouTube 74. Programación en Java || POO || Herencia en POO
 */
package T74Herencia;

/*Esta es la clase hija
Con la palabra reservada extends indicamos que Estudiante hereda de Persona*/
public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    /*Se crea un constructor especial en las clases que heredan
    Se indican como parámetros todos los atributos propios así como los 
    que se heredan*/
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        //Con súper se indica que ya están inicializados en la clase Persona (clase padre)
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nEdad: " + getEdad()
                + "\nCodigo de estudiante: " + codigoEstudiante
                + "\nNota final: " + notaFinal
        );
    }
}
