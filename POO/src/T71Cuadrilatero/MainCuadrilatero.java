//MainCuadrilatero.java

package T71Cuadrilatero;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class MainCuadrilatero {

    public static void main(String[] args) {
        //Se instancia un objeto sin llamarlo construir (sin crearlo)
        Cuadrilatero c1;

        float lado1;
        float lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));

        if (lado1 == lado2) {
            /*Al saber que debemos ingresar al constructor -> public Cuadrilatero(float lado1)
          creamos el objeto c1 con ese constructor*/
            c1 = new Cuadrilatero(lado1);
            System.out.println("El cuadrilatero ingresado es un cuadrado");
            System.out.println("El perimetro es: " + c1.getPerimetro());
            System.out.println("El area es: " + c1.getArea());
        } else {
            /*Como es un cuadrilátero utilizaremos el constructor de dos parámetros
          -> public Cuadrilatero(float lado1, float lado2), creamos el objeto
             */
            c1 = new Cuadrilatero(lado1, lado2);
            System.out.println("El cuadrilatero ingresado es un rectangulo");
            System.out.println("El perimetro es: " + c1.getPerimetro());
            System.out.println("El area es: " + c1.getArea());
        }
    }
}
