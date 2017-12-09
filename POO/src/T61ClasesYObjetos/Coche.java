//Coche.java

/*Referencia: 
*Video en YouTube 61. Programación en Java || POO || Creación de clases y objetos
 */
package T61ClasesYObjetos;

/**
 *
 * @author Javier
 */
//Modificador de acceso, palabra reservada class, nombre de la clase
public class Coche {

    //Se definen los atributos de clase Coche
    String color;
    String marca;
    int km;

    //Se crea el método con función main para poder ejecutar nuestro programa
    public static void main(String[] args) {
        //Dentro de este método se crean y se rellenan los objetos 

        //Se crea un nuevo objeto coche1
        //Nombre de la clase, nombre del objeto, = , se crea nuevo objeto, método constructor
        Coche coche1 = new Coche();

        //Se rellena el objeto
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        //Se muestran atributos del coche1, (ayuda: comando sout+tab)
        System.out.println("Atributos del coche 1");
        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("La marca del coche1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche1 es: " + coche1.km);

        //Se crea un segundo objeto 
        Coche coche2 = new Coche();
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        System.out.println("\nAtributos del coche 2");
        System.out.println("El color del coche2 es: " + coche2.color);
        System.out.println("La marca del coche2 es: " + coche2.marca);
        System.out.println("El kilometraje del coche2 es: " + coche2.km);

    }
}

