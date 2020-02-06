/**
 *
 * @author Maria Dolores Adamuz Barranco
 */
public class Primos {

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primos = true;

        while ((primos) && (contador != numero)) {
            if (numero % contador == 0) {
                primos = false;
            }
            contador++;
        }
        
        return primos;
    }
}
