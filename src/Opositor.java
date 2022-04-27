
public class Opositor {
	private String nombre;
	private String dni;
	private String telefono;
	private String ciudad;
	
	public Opositor() {
		super();
	}

	public Opositor(String nombre, String dni, String telefono, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public Opositor(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Opositor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", ciudad=" + ciudad + "]";
	}
	public String toString2() {
		return "Opositor [nombre: " + nombre + ", dni: " + dni + "]";
	}
}
