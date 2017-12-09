//Operacion2.java

/*Referencia: 
*Video en YouTube 63. Programación en Java || POO || Métodos - parámetros y argumentos
 */
package T63Parametros;

/**
 *
 * @author Javier
 */
public class Operacion2 {
    
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
   /*----------------------------------------------------------------------\*
                                 METODOS
   \*---------------------------------------------------------------------*/ 
   
    //Declaración del Método para sumar 2 números
    //int numero1 es un Parámetro: declaración de variable u objeto
    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;
    }

    //Método para restar 2 números
    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
    }

    //Método para multiplicar 2 números
    public void multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
    }

    //Método para dividir 2 números
    public void dividir(int numero1, int numero2) {
        division = numero1 / numero2;
    }

    //Método para mostrar el resultado
    public void mostrarResultado() {

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
