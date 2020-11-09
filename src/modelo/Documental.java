package modelo;

import java.time.LocalDateTime;

public class Documental extends Show {

	private String director;

	
	public Documental(String nombre, LocalDateTime fechaVisionado, int id, String director, int valoracion, LocalDateTime fechaPublicacion) {
		super(nombre, fechaVisionado, id, valoracion, fechaPublicacion);
		this.director = director;
		

	}

	
	public Documental(String nombre, LocalDateTime fechaVisionado, int id, String director, LocalDateTime fechaPublicacion) {
		super(nombre, fechaVisionado, id, fechaPublicacion);
		this.director = director;
	

	}


	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "Documental [director=" + director + ", nombre=" + nombre + ", fechaVisionado=" + fechaVisionado + ", fechaPublicacion="
				+ fechaPublicacion + ", id=" + id + ", valoracion=" + valoracion + "]";
	}

}
