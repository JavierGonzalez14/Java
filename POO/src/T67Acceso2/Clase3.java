//Clase3.java

package T67Acceso2;

//Se importa Clase1 desde el paquete 1
import T67Acceso1.Clase1;

/**
 *
 * @author Javier
 */
public class Clase3 {

    public static void main(String[] args) {
        //Se crea objeto de la Clase1 para acceder a atributo "atributo1"
        Clase1 objeto = new Clase1();
        //Se accede a atributo1 y se le asigna un valor a este
        objeto.atrributo1 = 15;
        System.out.println("Valor de atributo1: "+objeto.atrributo1);
    }
    
}
