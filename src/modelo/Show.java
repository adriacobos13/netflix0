package modelo;

import java.time.LocalDateTime;

public abstract class Show {
	protected String nombre;
	protected LocalDateTime fechaVisionado;
	protected LocalDateTime fechaPublicacion;
	protected int id;
	protected Integer valoracion;

	public Show(String nombre, LocalDateTime fechaVisionado, int id, Integer valoracion,LocalDateTime fechaPublicacion) {

		this.fechaVisionado = fechaVisionado;
		this.nombre = nombre;
		this.id = id;
		this.valoracion = valoracion;
		this.fechaPublicacion=fechaPublicacion;
	}

	public Show(String nombre, LocalDateTime fechaVisionado, int id,LocalDateTime fechaPublicacion) {
		this(nombre, fechaVisionado, id, null,fechaPublicacion);

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


	public LocalDateTime getFechaVisionado() {
		return fechaVisionado;
	}

	public void setFechaVisionado(LocalDateTime fechaVisionado) {
		this.fechaVisionado = fechaVisionado;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Show [nombre=" + nombre + ", fechaVisionado=" + fechaVisionado + ", fechaPublicacion=" + fechaPublicacion + ", id=" + id
				+ ", valoracion=" + valoracion + "]";
	}

	

}
