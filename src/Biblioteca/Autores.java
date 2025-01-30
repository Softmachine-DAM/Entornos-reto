package Biblioteca;

public class Autores extends Personas {
	private Integer CodAutor;

	public Autores(String nombre, String apellido1, String apellido2, Integer codAutor) {
		super(nombre, apellido1, apellido2);
		CodAutor = codAutor;
	}
	
}
