//Clase4.java

/*Referencia: 
*Video en YouTube 68. Programación en Java || POO || Encapsulamiento y métodos accesores (Getters y Setters)
 */
package T68Encapsulamiento;

/**
 *
 * @author Javier
 */
public class Clase4 {
    //Encapsulamiento: ocultar algunos datos para que no cualquiera pueda modificarlos
    //solo métodos de la misma clase
    //Se encapsula el atributo edad de tipo int
    private int edad;
    private String nombre;
    
   /*----------------------------------------------------------------------\*
                                METODOS ACCESORES
   \*----------------------------------------------------------------------*/ 
    
    //Métodos accesores (usados para los atributos privados)
    //--------------------------------SETTER-------------------------------//
    //Setter: establecer un valor al atributo, se declara de tipo void ya que no 
    //regresa valor, recibe como parámetro el atributo
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //--------------------------------GETTER-------------------------------//
    //Getter: obtener el valor del atributo, retorna el tipo del atributo
    public int getEdad() {
        return edad;
    }

    //Para atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

