//DECLARAR 6 VARIABLES DE TIPO DISTINTO y DETECTAR ERRORES
package ejercicio1;

/**
 *
 * @author iArielARG
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        //Variable uno: Tipo de dato nombreVariable;
        String tipoClaseString;
        
        //Variable dos: Tipo de dato nombreVariable;
        int numEntero;
        
        //Variable tres: Tipo de dato nombreVariable;
        float decimal32bits;
        
        //Variable cuatro: Tipo de dato nombreVariable;
        boolean condicionVF;
        
        //Variable cinco: Tipo de dato nombreVariable;
        double numDecimal64bits;
        
        //Variable seis: Tipo de dato nombreVariable;
        char caracter16bits;
        
        //DETECTAR ERRORES DE DECLARACIÓN DE VARIABLES.
        //public static void main(String[] args) {
        //string nombre
        //bolean bandera
        //char char;
        //}
    //}
        //CORREJIDO
        //DECLARACIÓN MÉTODO MAIN. public static void main(String[] args) {
            String nombre;
            boolean bandera;
            char character;
        //CIERRE DE MÉTODO MAIN. }
    //CIERRE DE Class.}
    
        //EXISTEN DOS FORMAS DE ASIGNAR VALOR A UNA VARIABLE.
        String apellido;
        apellido = "López";
        
        //O SINO
        String nacionalidad = "Argentino";
        int numero = 10;
        double decimales = 40.5;
        
        //VALORES POR DEFECTO
        short num = 0;
        int num1 = 0;
        long num2 = 0;
        double num3 = 0.0;
        boolean condicion = false;
        char caracter = '\u0000';
        String word = null;
        Object Croupier = null;
        //Variable LOCAL no inicializada, dará error en tiempo de compilación.
        
    
    }
    
}
