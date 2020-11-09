package modelo;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Serie extends Show {
	private String estudio;
	private int numTemporadas;
	private int[] valoraciones;

	
	
	public Serie(String nombre, LocalDateTime fechaVisionado, int id, String estudio, int numTemporadas, LocalDateTime fechaPublicacion) {
		super(nombre, fechaVisionado, id,fechaPublicacion);
		this.estudio=estudio;
		this.numTemporadas=numTemporadas;
	}

	public Serie(String nombre, LocalDateTime fechaVisionado, int id,int[] valoraciones , String estudio, int numTemporadas, LocalDateTime fechaPublicacion) {
		super(nombre, fechaVisionado, id,fechaPublicacion);
		this.estudio=estudio;
		this.numTemporadas=numTemporadas;
		this.valoraciones=valoraciones;
	}

	public Serie(String nombre, LocalDateTime fechaVisionado, int id,int valoracion , String estudio, int numTemporadas, LocalDateTime fechaPublicacion) {
		super(nombre, fechaVisionado, id,fechaPublicacion);
		this.estudio=estudio;
		this.numTemporadas=numTemporadas;
		this.valoracion=valoracion;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public int getTemporadas() {
		return numTemporadas;
	}

	public void setTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public int[] getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(int[] valoraciones) {
		this.valoraciones = valoraciones;
	}

	@Override
	public String toString() {
		return "Serie [estudio=" + estudio + ", numTemporadas=" + numTemporadas + ", valoraciones="
				+ Arrays.toString(valoraciones) + ", nombre=" + nombre + ", fechaVisionado=" + fechaVisionado
				+ ", fechaPublicacion=" + fechaPublicacion + ", id=" + id + ", valoracion=" + valoracion + "]";
	}






	
}
