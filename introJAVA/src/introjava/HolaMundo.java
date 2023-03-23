package introjava;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class HolaMundo {
    public static void main(String[] args) {
        //Se crea una variable Scanner que se utiliza para Leer datos del usuario.
        Scanner leer = new Scanner(System.in);
        
        //Se crea una variable Cadena (String) que se utiliza para Leer datos del usuario.
        String nombre;
        
        //Muestra un mensaje por pantalla.
        System.out.println("Ingresa tu nombre y presiona ENTER:");
        
        //Leemos el nombre de la persona en la variable nombre.
        nombre = leer.next();
        
        //Mostramos por consola un saludo personalizado.
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en JAVA!");
    }
    
}
