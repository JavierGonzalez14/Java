//Persona.java

/*Referencia: 
*Video en YouTube 69. Programación en Java || POO || Constantes
 */
package T69Constantes;

/**
 *
 * @author Javier
 */
public class Persona {
    //Final declara una constante, una vez que se rellena en el
    //constructor ya no cambia en el programa
    private final String nombre;
    //Para nombre no se puede crear ni setter ni getter
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    /**
     * Asi se realiza la documentacion de un metodo
     * @param edad 
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
}
