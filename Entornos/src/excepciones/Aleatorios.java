package excepciones;

import java.util.*;

public class Aleatorios {
	//comentario de prueba para git hub 

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("helos ");
		System.out.println("Introduce el numero de elementos del array");
		int elementos = entrada.nextInt();
		
		int num_aleat[]=new int [elementos];
		
		for (int i=0;i<num_aleat.length;i++)
		{
			num_aleat[i]= (int)(Math.random()*100);
		}
		
		for (int elem: num_aleat)
		{
			System.out.println(elem);
		}

	}
// en el args string el numero es la cantidad de memeoria
	
}