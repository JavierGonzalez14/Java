//VehiculoFurgoneta.java

package T77Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public int getCarga() {
        return carga;
    }
    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nCarga: " + carga;
    }
}
