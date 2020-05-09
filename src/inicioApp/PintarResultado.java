/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioApp;

/**
 *
 * @author Roberto
 */
public class PintarResultado {

    static String textoCaracterTotal(int ContadorCaracteres) {
        return "Hay un total de " + ContadorCaracteres + " caracteres.";
    }

    static String textoNumeroPalabras(int ContadorEspacios) {
        return "Hay un total de " + ContadorEspacios + " palabras";
    }

    static String textoTodosCaracteres(int i) {
        return "La letra " + inicioApp.arrayLetrasRepetidas[i] + " se repite " + inicioApp.contadorVecesRepetida[i];
    }
    
}
