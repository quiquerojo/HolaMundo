import java.util.Scanner;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class HolaMundo {

	
	private static Scanner entrada;

	/**Programa que saluda al mundo
	 * @param args
	 */
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		String nombre = null;
		System.out.println("Hola Mundo");
		System.out.print("Dame tu nombre: ");
		nombre = entrada.nextLine();
		System.out.println("De todo el mundo, te saludo a tí, "+nombre);

	}

}
