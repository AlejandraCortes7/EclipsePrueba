package Bibloteca;
import java.util.*;
public class RegistrarLibro {

	public static void main(String[] args) {
		
		String codigo,titulo, autor;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce codigo: ");
		codigo = sc.next();
		
		System.out.println("Introduce titulo: ");
		titulo = sc.next();
		
		System.out.println("Introduce autor: ");
		autor = sc.next();
		
		ValidarDatos vd = new ValidarDatos(codigo, titulo, autor);
		
		if(vd.ValidarAutorCorrecto() && vd.ValidarCodigoCorrecto() && vd.ValidarTituloCorrecto()) {
			System.out.println(vd.RegistrarLibro());
		}
	}

}
