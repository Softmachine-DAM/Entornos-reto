package Biblioteca;

public class Empleados extends Usuarios {
	private Integer SeguridadSocial;

	public Empleados(String nombre, String apellido1, String apellido2, String dNI, Integer telefono, String correo,
			String nombreUsuario, String contraseña, Integer seguridadSocial) {
		super(nombre, apellido1, apellido2, dNI, telefono, correo, nombreUsuario, contraseña);
		SeguridadSocial = seguridadSocial;
	}
	public String fichar() {
        return "Empleado fichado a las: " + new java.util.Date();
    }
    
    public String desfichar() {
        return "Empleado desfichado a las: " + new java.util.Date();
    }
}
