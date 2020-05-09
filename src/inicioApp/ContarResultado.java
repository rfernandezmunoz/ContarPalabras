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
public class ContarResultado {

    static int contarCaracteresTotal(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) != ' ') {
                inicioApp.ContadorCaracteres++;
            }
        }
        return inicioApp.ContadorCaracteres;
    }

    static int contarNumeroPalabras(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) == ' ') {
                inicioApp.ContadorEspacios++;
            }
        }
        return inicioApp.ContadorEspacios;
    }

    static int[] contarTodosCaracteres(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            char letraActual = Cadena.charAt(i);
            boolean letraEncontrada = false;
            int j = 0;
            while (j < inicioApp.arrayLetrasRepetidas.length && letraEncontrada == false) {
                if (letraEncontrada == false && inicioApp.contadorVecesRepetida[j] == 0) {
                    inicioApp.arrayLetrasRepetidas[j] = letraActual;
                    inicioApp.contadorVecesRepetida[j]++;
                    letraEncontrada = true;
                } else {
                    if (letraActual == inicioApp.arrayLetrasRepetidas[j]) {
                        inicioApp.contadorVecesRepetida[j]++;
                        letraEncontrada = true;
                    }
                }
                j++;
            }
        }
        return inicioApp.contadorVecesRepetida;
    }
    
}
