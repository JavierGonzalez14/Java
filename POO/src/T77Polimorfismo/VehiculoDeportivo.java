//VehiculoDeportivo.java

package T77Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nCilindrada: " + cilindrada;
    }
}
