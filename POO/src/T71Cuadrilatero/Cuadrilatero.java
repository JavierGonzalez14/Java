//Cuadrilatero.java

/*Referencia: 
*Video en YouTube 71. Programación en Java || POO || Ejercicio - Obtener el perímetro y área de un cuadrilátero
 */
package T71Cuadrilatero;

/**
 *
 * @author Javier
 */
public class Cuadrilatero {
    /*
      Ejercicio 1: Construir un programa que calcule el área y el perímetro de un
      cuadrilátero dada la longitud de sus lados. Los valores de la longitud deberán
      introducirse por línea de órdenes. Si es un cuadrado, solo se proporcionara la
      longitud de uno de los lados al constructor.
    
     *Diagrama de Clases (UML) 
      
      ------------------------------------------
      |             Cuadrilátero                |
      ------------------------------------------
      |-lado1: float                            | //Atributos
      |-lado2: float                            |
      ------------------------------------------
      |Cuadrilatero(float: lado1, float: lado2) | //Métodos
      |Cuadrilatero(float: lado1)               |
      |getPerimetro(): float                    |
      |getArea(): float                         |
      |                                         |
      -------------------------------------------
     
    Nota: El signo menos en el atributo indica que su modificador de acceso 
    será privado
     */
    private float lado1;
    private float lado2;

    //Método constructor 1 (se utilizara con el cuadrilátero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Método constructor 2 (se utilizara con el cuadrado)
    public Cuadrilatero(float lado1) {
        //Se iguala el parámetro lado uno a ambos atributos de la clase
        this.lado1 = this.lado2 = lado1;
    }

    //Método getter para obtener el perímetro
    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    //Método getter para obtener el área
    public float getArea() {
        float area = lado1 * lado2;
        return area;
    }
}
