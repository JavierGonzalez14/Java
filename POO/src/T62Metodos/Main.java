//Main.java

package T62Metodos;
//Nota: En Java un programa es un conjunto de definiciones de clases que están
//dispuestas en uno o más archivos.

/**
 *
 * @author Javier
 */
public class Main {

    /**
     * Las palabras public y static son atributos del método. La palabra void
     * indica que el método main no retorna ningún valor. String[] args: Los
     * paréntesis [] indican que el argumentos es un arreglo y la palabra String
     * es el tipo de los elementos del arreglo. Por lo tanto main recibe como
     * argumento un arreglo de strings que corresponden a los argumentos con que
     * se invoca el programa.
     */
    public static void main(String[] args) {
        //Se crea un nuevo objeto de la clase Operacion
        Operacion op = new Operacion();

        //Se mandan llamar a los métodos necesarios, si no se mandan llamar aquí
        //no se ejecutaran en la clase Operación
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultado();
    }

}
