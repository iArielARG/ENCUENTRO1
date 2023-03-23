//DEFINE VARIABLES DONDE PUEDAS ALOJAR LOS RESULTADOS Y PRUEBA
//USAR DOS OPERADORES DE CADA TIPO.
package ejercicio3;

/**
 * @author iArielARG
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
     int num1 = 5;
     int num2 = 5;
     
     int suma = num1 + num2;
     double division = num1 / num2;
     boolean logico = num2 < num1;
     
     num1++;
     
     System.out.println("CONCATENAR UNA SALIDA POR PANTALLA.");
     System.out.println("El valor de la variable num1 es: " + num1);
     
     System.out.println("SALIDA POR PANTALLA SIN SALTAR.");
     System.out.print("[" + suma + "]");
     System.out.print(" " + "[" + logico + "]");
     System.out.println(" ");
    }
    
}
