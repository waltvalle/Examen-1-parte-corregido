import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// Se imprime Ingrese un numero e Ingrese una cadena y el usuario ingresa los numeros y el texto//
		Scanner s= new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int x;
		x= s.nextInt();
		
		System.out.print("Ingrese una Cadena: ");
		String y=s.next();
		
		//Se crea un contador que repita la cadena la cantidad de veces que el usuario asigne//
		int i=0;
		while (i<=x)
		{
			System.out.println(y);
			i++;
		}
		
	}

}
