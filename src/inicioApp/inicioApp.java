package inicioApp;
import java.util.Scanner;

/*
 * Esta clase inicioApp contiene el metodo main. Esta clase hereda de la clase pintarResultado y contiene las 
 * variables que son estaticas.
 * @author Roberto
 * @version 1.0
 */
public class inicioApp {
	static int ContadorCaracteres=0;
	static int ContadorEspacios=1;
        static int [] contadorVecesRepetida;
        static char[] arrayLetrasRepetidas;
/*
 * El metodo main lo que hara sera el coger la frase que escribamos por pantalla con la clase Scanner despues
 * de hacer todo esto, lo que haremos sera la cadena dividirla en un array de char y haremos otro array de
 * int para contar las veces repetidas de cada letra.
 * Tambien pasaremos los valores a la clase PintarResultado.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica una frase: ");
		String Cadena = sc.nextLine();
                
                contadorVecesRepetida = new int[Cadena.length()];
                arrayLetrasRepetidas = new char[Cadena.length()];
                
		int TotalCaracteres = ContarResultado.contarCaracteresTotal(Cadena);
                int TotalPalabras = ContarResultado.contarNumeroPalabras(Cadena);
                ContarResultado.contarTodosCaracteres(Cadena);
                
                System.out.println(PintarResultado.textoCaracterTotal(TotalCaracteres));
                System.out.println(PintarResultado.textoNumeroPalabras(TotalPalabras));
                for(int i=0;i<contadorVecesRepetida.length;i++){
                    if(contadorVecesRepetida[i] >=1 && arrayLetrasRepetidas[i] != ' '){
                        System.out.println(PintarResultado.textoTodosCaracteres(i));
                    }
                }
                
        }//MAIN
}