package netflix0;

import java.time.LocalDateTime;

public abstract class Show {
	protected String nombre;
	protected LocalDateTime fecha;
	protected int id;
	protected Integer valoracion;

	public Show(String nombre, LocalDateTime fecha, int id, Integer valoracion) {

		this.fecha = fecha;
		this.nombre = nombre;
		this.id = id;
		this.valoracion = valoracion;

	}

	public Show(String nombre, LocalDateTime fecha, int id) {
		this(nombre, fecha, id, null);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	abstract public String mostrarDatos();
	
	abstract public String mostrarDatosYValoracion();

}
