//Persona.java

/*Referencia: 
*Video en YouTube 65. Programación en Java || POO || Método Constructor
 */
package T65Constructor;

/**
 *
 * @author Javier
 */
public class Persona {

    String nombre;
    int edad;

   /*----------------------------------------------------------------------\*
                                 METODOS
   \*---------------------------------------------------------------------*/ 
    
    //Se crea método constructor este nos sirve para poder inicializar 
    //los atributos que tiene nuestro objeto
    //Único método en el que no se especifica el valor de retorno
    public Persona(String nombre, int edad) {
        //Java entiende lo siguiente:
        //this: este nombre es exactamente el atributo, 
        //el que no tiene this es el parámetro del constructor
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método para mostrar los datos
    public void mostarDatos() {
        //Se imprimen los atributos de p1
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
