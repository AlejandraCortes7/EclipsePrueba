package Actividad;

import java.util.Scanner;

public class Poligono {
	
	static Scanner entrada = new Scanner(System.in);

	public Poligono()
	{
		
	}

	
	public static double calcular_area_rectangulo(double base, double altura)
	{
		double area = base * altura;
		
		return area;
	}
	
	public static double calcular_perimetro_rectangulo(double base, double altura)
	{
		
		double perim = 2*base + 2*altura;
		
		return perim;
	}

	public static double calcular_area_circulo(double radio)
	{
		
		double area = Math.PI*Math.pow(radio, 2);
		
		return area;
		
	}
	
	public static int calcular_area_triangulo(int base, int altura)
	{		
		int area = (base * altura)/2;
		
		return area;
		
	}
}