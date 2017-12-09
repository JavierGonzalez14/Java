//Estatico.java

/*Referencia: 
*Video en YouTube 70. Programación en Java || POO || Miembros estáticos de una clase
 */
package T70Estatico;

/**
 *
 * @author Javier
 */
public class Estatico {

    /*El atributo de tipo estático ya no le pertenece a los objetos le pertenece a
      la clase, el último cambio que se le realice será el definitivo de todos 
      los objetos*/
    private static String frase = "Primera frase";

    /*Definimos un método estático, al igual que los atributos este le pertenece
      a la clase no al objeto*/
    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {
        /*--------------------------------------------------------------------
          Cada objeto crea una copia de los atributos que no son estáticos
        
        Estatico ob1 = new Estatico(); Estatico ob2 = new Estatico();
        
        ob2.frase="Segunda frase"; System.out.println(ob1.frase);
        System.out.println(ob2.frase);

          De la manera anterior se crea una copia para cada objeto y se pueden 
          modificar individualmente (cada objeto), el atributo utilizado fue el 
          siguiente -> private String frase="Primera frase";
          -------------------------------------------------------------------*/
        /*Cuando un atributo es estático no es necesario instanciar un objeto
          Se puede acceder a él directamente, de la siguiente manera*/
        System.out.println(Estatico.frase);

        //Acceder a método estático
        System.out.println("La suma es: " + Estatico.sumar(4, 3));
    }
}
