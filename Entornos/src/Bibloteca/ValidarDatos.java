package Bibloteca;

public class ValidarDatos {

	String codigo, titulo, autor;
	
	//Codigo libro CL32
	String VcodigoL = "[C][L][0-9][0-9]";
	
	//autor y titulo --> Empiezan por  Mayusculas y luego todo minusculas
	String VcodigoA = "[A-Z][a-z]*";
	
	public ValidarDatos(String codigo, String titulo, String autor) {
		this.codigo=codigo;
		this.titulo=titulo;
		this.autor=autor;
	}
	public boolean ValidarCodigoCorrecto() {
		if(!codigo.matches(VcodigoL)|| codigo == null ){//comprobar las condiciones 
			System.out.println ("Codigo no correcto");
			return false;
		}
		return true;
	}
	public boolean ValidarTituloCorrecto() {
		if(!titulo.matches(VcodigoA)|| titulo == null ){//comprobar las condiciones 
			System.out.println ("Titulo no correcto");
			return false;
		}
		return true;
	}
	public boolean ValidarAutorCorrecto() {
		if(!autor.matches(VcodigoA)|| autor == null ){//comprobar las condiciones 
			System.out.println ("Autor no correcto");
			return false;
		}
		return true;
	}

	public String RegistrarLibro() {
		
		String mensaje="";
		if(!ValidarCodigoCorrecto())//comprobar las condiciones 
		mensaje = "Codigo Erroneo";
		else {
			if(!ValidarTituloCorrecto())//comprobar las condiciones 
				mensaje = "Titulo Erroneo";
				else { 
					if(!ValidarAutorCorrecto())//comprobar las condiciones 
						mensaje = "Autor Erroneo";
						else {
							mensaje = "Registro correcto";
						}
				}
		}
		return mensaje;
	}
		
	}

