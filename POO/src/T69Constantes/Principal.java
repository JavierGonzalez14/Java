//Principal.java

package T69Constantes;

/**
 *
 * @author Javier
 */
public class Principal {

    public static void main(String[] args) {
        //Se inicializa edad con 23
        Persona persona = new Persona("Javier Gonzalez", 23);
        //A lo largo del programa se cambia a 24
        persona.setEdad(24);
        
        persona.mostrarDatos();
    }

}
