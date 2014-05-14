import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		//Ejercicio1: Se imprime el nombre de una pelicula//
		
		Scanner s= new Scanner(System.in);
		System.out.print("The Avengers:");
		
		//Se ingresa un puntaje del 1 al 5 siendo el rating de Pesima a Excelente//
		int rate=s.nextInt();
		switch (rate)
		{
			case 1:
				System.out.print("Pesima");
				break;
			case 2:
				System.out.print("Mala");
				break;
			case 3:
				System.out.print("Regular");
				break;	
			case 4:
				System.out.print("Buena");
				break;	
			case 5:
				System.out.print("Excelente");
				break;	
		}
		
	}

}
