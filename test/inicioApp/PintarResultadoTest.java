package inicioApp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Roberto
 * version 1.0
 * Lo que hare en este Test sera saber si la clase PintarResultado.java esta contando bien los parametros
 * que estamos introduciendo
 */
public class PintarResultadoTest {

/**
 * El primer test que sea hara sera el metodo TextoCaracterTotal, para ello necesitamos un int y probar si
 * es true o false con el resultado que le indiquemos. En este el resultado final sera el total de caracteres.
 * Para el resultado sera un String entonces le indicaremos el return del metodo.
 */
    @Test
    public void testTextoCaracterTotal() {
        int ContadorCaracteres = 4;
        assertTrue("Hay un total de 4 caracteres.".equals(PintarResultado.textoCaracterTotal(ContadorCaracteres)));
        assertFalse("Hay un total de 6 caracteres.".equals(PintarResultado.textoCaracterTotal(ContadorCaracteres)));

    }
/**
 * El primer test que sea hara sera el metodo TextoNumeroPalabras, para ello necesitamos un int y probar si
 * es true o false con el resultado que le indiquemos. En este el resultado final sera el total de caracteres.
 * Para el resultado sera un String entonces le indicaremos el return del metodo.
 */
    @Test
    public void testTextoNumeroPalabras() {
        int ContadorEspacios = 4;
        assertTrue("Hay un total de 4 palabras".equals(PintarResultado.textoNumeroPalabras(ContadorEspacios)));
        assertFalse("Hay un total de 6 palabras".equals(PintarResultado.textoNumeroPalabras(ContadorEspacios)));
    }   
}
