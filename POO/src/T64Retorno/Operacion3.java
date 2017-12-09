//Operacion3.java

/*Referencia: 
*Video en YouTube 64. Programación en Java || POO || Métodos - Retorno de valores
 */
package T64Retorno;

/**
 *
 * @author Javier
 */
public class Operacion3 {
    //Una clase puede tener solo atributos o únicamente métodos, no hay problema
    
   /*----------------------------------------------------------------------\*
                                 METODOS
   \*---------------------------------------------------------------------*/ 
   
    //Declaración del Método para sumar 2 números
    //retornando un valor entero
    public int sumar(int numero1, int numero2) {
        //Se define variable de manera local
        int suma = numero1 + numero2;
        return suma;
    }

    //Método para restar 2 números
    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    //Método para multiplicar 2 números
    public int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    //Método para dividir 2 números
    public int dividir(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

}
