package Biblioteca;

public class Usuarios extends Personas {
	private String DNI;
	private Integer Telefono;
	private String Correo;
	private String NombreUsuario;
	private String Contraseña;
	public Usuarios(String nombre, String apellido1, String apellido2, String dNI, Integer telefono, String correo,
			String nombreUsuario, String contraseña) {
		super(nombre, apellido1, apellido2);
		DNI = dNI;
		Telefono = telefono;
		Correo = correo;
		NombreUsuario = nombreUsuario;
		Contraseña = contraseña;
	}
	
	public void iniciarSesion(String usuario) {
        System.out.println("Iniciando sesión como: " + usuario);
    }
	
}
