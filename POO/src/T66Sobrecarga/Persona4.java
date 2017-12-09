//Persona4.java

/*Referencia: 
*Video en YouTube 66. Programación en Java || POO || Sobrecarga de Métodos
 */
package T66Sobrecarga;

/**
 *
 * @author Javier
 */
public class Persona4 {

    String nombre;
    int edad;
    String codigo;
    
   /*---------------------------------------------------------------------\*
                                CONSTRUCTORES
   \*---------------------------------------------------------------------*/ 


    //Sobrecarga de Constructores: tienen el mismo nombre, pueden tener 
    //distinta cantidad de parámetros, o la misma pero deben ser de diferente tipo
    //de dato en dicho caso.
    //El constructor no lleva variable de retorno
    //Se crea primer constructor
    public Persona4(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Se crea segundo constructor
    public Persona4(String codigo) {
        this.codigo = codigo;
    }
    
   /*----------------------------------------------------------------------\*
                                 METODOS
   \*---------------------------------------------------------------------*/ 

    //Primer método
    //Sobrecarga de métodos
    public void correr() {
        System.out.println("Mi nombre es "+nombre+" tengo "+edad+" y estoy corriendo un maraton");
    }

    //Segundo método
    //Al contener un parámetro se diferencia del método anterior
    public void correr(int km) {
        System.out.println("He corrido " + km + " kilometros, mi codigo es " + codigo);
    }

}

