//Operacion.java

/*Referencia: 
*Video en YouTube 62. Programación en Java || POO || Concepto y creación de métodos
 */
package T62Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
   /*----------------------------------------------------------------------\*
                                 METODOS
   \*---------------------------------------------------------------------*/
    
    //Método para pedirle al usuario 2 números
    //Modificador de acceso, valor de retorno, nombre del método, sin argumentos
    public void leerNumeros() {
        //La clase Integer envuelve el tipo primitivo int en un objeto.
        //convertir string a número. objeto de java para cuadros de dialogo.
        //método para mostrar dialogo
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }

    //Método para sumar 2 números
    public void sumar() {
        suma = numero1 + numero2;
    }

    //Método para restar 2 números
    public void restar() {
        resta = numero1 - numero2;
    }

    //Método para multiplicar 2 números
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    //Método para dividir 2 números
    public void dividir() {
        division = numero1 / numero2;
    }

    //Método para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("Los numeros ingresados fueron: " + numero1 + " y " + numero2);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
