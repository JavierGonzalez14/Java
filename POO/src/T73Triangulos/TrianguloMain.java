//TrianguloMain.java

package T73Triangulos;

import java.util.Scanner;

public class TrianguloMain {

    /*Método para obtener el objeto de mayor área, como parámetro un arreglo de 
    triángulos de tipo Triangulo*/
    public static double mayorArea(Triangulo triangulos[]) {
        double area;

        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.print("Digite el numero de triangulos isoseles: ");
        nTriangulos = entrada.nextInt();

        Triangulo triangulos[] = new Triangulo[nTriangulos];
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo " + (i + 1) + ":");
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite la lado: ");
            lado = entrada.nextDouble();
            /*Se guardan en arreglo el objeto de la clase triangulo por cada
            iteracion*/
            triangulos[i] = new Triangulo(lado, base);
            System.out.println("El perimetro es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El area es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulos));
    }

}
