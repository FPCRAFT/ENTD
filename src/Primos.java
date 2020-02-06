/**
 *
 * @author Maria Dolores Adamuz Barranco
 */
public class Primos {
    
    private static boolean primo;
    
    public static boolean esPrimo(int numero) {
        int contador = 2;
        primo = true;

        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        
        return primo;
    }
}
