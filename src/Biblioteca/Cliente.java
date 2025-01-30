package Biblioteca;

public class Cliente extends Usuarios {
	private Integer NumeroPrestamos;
	private Boolean Penalizacion;
	public Cliente(String nombre, String apellido1, String apellido2, String dNI, Integer telefono, String correo,
			String nombreUsuario, String contraseña, Integer numeroPrestamos, Boolean penalizacion) {
		super(nombre, apellido1, apellido2, dNI, telefono, correo, nombreUsuario, contraseña);
		NumeroPrestamos = numeroPrestamos;
		Penalizacion = penalizacion;
	}
	public void prestar() {
        System.out.println("Realizando préstamo...");
    }
}
