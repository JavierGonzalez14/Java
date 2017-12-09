//Planta.java

package T76Abstraccion;

public class Planta extends SerVivo {

    //Sobre escribimos el método alimentarse
    @Override
    public void alimentarse() {
        System.out.println("La planta se alimenta mediante fotosintesis");
    }
}
