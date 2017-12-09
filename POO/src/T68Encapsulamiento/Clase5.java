//Clase5.java

package T68Encapsulamiento;

/**
 *
 * @author Javier
 */
public class Clase5 {

    public static void main(String[] args) {
       
        Clase4 persona = new Clase4();
        //Se establece atributo edad por medio del método setEdad
        persona.setEdad(22);
        //Se obtiene atributo edad por medio del método getEdad
        System.out.println("Edad: "+persona.getEdad());
        
        persona.setNombre("Javier Gonzalez");
        System.out.println("Edad: "+persona.getNombre());
        
    }
    
}
