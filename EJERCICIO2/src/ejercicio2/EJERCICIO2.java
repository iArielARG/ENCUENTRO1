/*ASIGNARLES UN VALOR A CADA UNA DE LAS SEIS VARIABLES CREADAS
*EN EL EJERCICIO1
*/
package ejercicio2;

/**
 * @author iArielARG
 */
public class EJERCICIO2 {

    public static void main(String[] args) {
        //Variable uno: Tipo de dato nombreVariable;
        String tipoClaseString;
        tipoClaseString = "Fabrizio";
        
        //Variable dos: Tipo de dato nombreVariable;
        int numEntero;
        numEntero = 2019;
        
        //Variable tres: Tipo de dato nombreVariable;
        float decimal32bits;
        decimal32bits = 1;
        
        //Variable cuatro: Tipo de dato nombreVariable;
        boolean condicionTF;
        condicionTF = true;
        
        //Variable cinco: Tipo de dato nombreVariable;
        double numDecimal64bits;
        numDecimal64bits = 1.21;
        
        //Variable seis: Tipo de dato nombreVariable;
        char caracter16bits;
        caracter16bits = 'C';
        
        //DETECTAR ERRORES DE DECLARACIÓN DE VARIABLES.
        //DECLARACIÓN MÉTODO MAIN. public static void main(String[] args) {
            //int numero = "48";
            //double decimales = 3,55;
            //bolean bandera -> "false";
        //CIERRE DE MÉTODO MAIN. }
    //CIERRE DE Class.}
    
        //CORREJIDO
        //DECLARACIÓN MÉTODO MAIN. public static void main(String[] args) {
            int numero = 48;
            double decimales = 3.55;
            boolean bandera = false;
        //CIERRE DE MÉTODO MAIN. }
    //CIERRE DE Class.}
    }
    
}
