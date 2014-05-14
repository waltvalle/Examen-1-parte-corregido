import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		//Aqui se ingresan los puntajes//
		System.out.print("Puntaje 1: ");
		int puntaje1;
		puntaje1=s.nextInt();
		
		System.out.print("Puntaje 2: ");
		int puntaje2;
		puntaje2=s.nextInt();
		
		System.out.print("Puntaje 3: ");
		int puntaje3;
		puntaje3=s.nextInt();
		
		//Aqui se crea el promedio en base a los 3 puntajes y se califican de Excelente a Suficiente o si Haz Perdido//
		int promedio;
		promedio= (puntaje1+puntaje2+puntaje3)/3;
		System.out.print("Promedio: "+promedio);
		{
			if (promedio>1000)
			System.out.print(" Excelente");
			else if (promedio>700)
			System.out.print(" Bueno");
			else if (promedio>500)
			System.out.print(" Suficiente");
			else if (promedio<500)
			System.out.print(" Haz perdido");
		}
		
		
		
	}

}
