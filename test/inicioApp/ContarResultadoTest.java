package inicioApp;

import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * @author Roberto
 * version 1.0
 * Lo que hare en este Test sera saber si la clase ContarResultado.java esta contando bien los parametros
 * que estamos introduciendo
 */
public class ContarResultadoTest {
   
/**
 * El primer test que sea hara sera el metodo ContarCaracteresTotal, para ello necesitamos un String y probar si
 * es true o false con el resultado que le indiquemos. En este el resultado final sera el total de caracteres.
 */
    
    @Test
    public void testContarCaracteresTotal() {
        String Cadena = "hola que tal";
        assertTrue(ContarResultado.contarCaracteresTotal(Cadena)==10);
        assertFalse(ContarResultado.contarCaracteresTotal(Cadena)==4);
    }

/**
 * El segundo test que sea hara sera el metodo ContarNumeroPalabras, para ello necesitamos un String y probar si
 * es true o false con el resultado que le indiquemos. En esta el resultado final sera el total de palabras.
 */
    @Test
    public void testContarNumeroPalabras() {
        String Cadena = "Hola que tal";
        assertTrue(ContarResultado.contarNumeroPalabras(Cadena)==3);
        assertFalse(ContarResultado.contarNumeroPalabras(Cadena)==6);
    }  
}
