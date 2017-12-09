//VehiculoTurismo.java

package T77Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    //Como hereda de vehículo ya solo se definen los atributos propios
    private int nPuertas;

    public int getPuertas() {
        return nPuertas;
    }

    //Metodo constructor específico para VehiculoTurismo
    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    /*Se sobre escribe el método para hacerlo específico para VehiculoTurismo*/
    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo
                + "\nNumero de puertas: " + nPuertas;
    }
}
