//Main3.java

package T64Retorno;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Main3 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operacion3 op = new Operacion3();
        
        //Se imprime el valor entero que retorna el método sumar, se puede hacer 
        //de esta manera o guardar el valor en una variable tipo int para
        //después imprimirla
        System.out.println("La suma es: " + op.sumar(n1, n2));
        System.out.println("La resta es: " + op.restar(n1, n2));
        System.out.println("La multiplicacion es: " + op.multiplicar(n1, n2));
        System.out.println("La division es: " + op.dividir(n1, n2));
    }

}
