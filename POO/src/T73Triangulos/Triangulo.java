//Triangulo.java

/*Referencia: 
*Video en YouTube 73. Programación en Java || POO || Ejercicio - Área y perímetro de triángulos isósceles
 */
package T73Triangulos;

/*
    Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para ello 
    defina los atributos necesarios, proporcione métodos de consulta, un método 
    constructor e implemente métodos para calcular el perímetro y el área de un 
    triángulo, además implementar un método que a partir de un arreglo de triángulos
    devuelva el área del triángulo de mayor superficie 
 */
public class Triangulo {

    private double lado;
    private double base;

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public double obtenerPerimetro() {
        double perimetro = 2 * lado + base;
        return perimetro;
    }

    public double obtenerArea() {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }
}
