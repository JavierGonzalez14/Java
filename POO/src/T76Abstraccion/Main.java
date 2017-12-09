//Main.java

package T76Abstraccion;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        Planta planta = new Planta();
        AnimalCarnivoro animalCar = new AnimalCarnivoro();
        planta.alimentarse();
        animalCar.alimentarse();
    }

}
