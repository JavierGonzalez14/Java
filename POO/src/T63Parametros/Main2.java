//Main2.java

package T63Parametros;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Main2 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        //Nota: si usamos el nombre como numero1 en vez de n1 el programa igual funciona
        //la intención fue diferenciar Argumento de Parámetro

        Operacion2 op = new Operacion2();

        //Invocación del método
        //es un Argumento: valor que se envía
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        System.out.println("Los numeros ingresados fueron: " + n1 + " y " + n2);
        op.mostrarResultado();

    }

}
