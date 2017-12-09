//Main4.java

package T66Sobrecarga;

/**
 *
 * @author Javier
 */
public class Main4 {

    public static void main(String[] args) {

        //Se crea objeto persona1 usando el primer constructor -> Persona4(String nombre, int edad)
        //se crean únicamente los atributos del código constructor nombre y edad,
        //es decir, para este objeto no se crea el atributo código, si lo añades se 
        //mostrara como null
        Persona4 persona1 = new Persona4("Javier Gonzalez", 23);
        //Se utiliza el primer método correr () -> este no lleva argumentos
        persona1.correr();

        //Se crea objeto persona 2 usando el segundo constructor -> Persona4(String codigo)
        Persona4 persona2 = new Persona4("212356447");
        //Se utiliza el primer método correr () -> este lleva argumento km de tipo int
        persona2.correr(10);

    }

}

