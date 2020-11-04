package netflix0;

public class Serie extends Show {
	private String estudio;
	private int temporadas;
	private int[] valoraciones;

	
	
	//metodos constructores
	public Serie(String nombre, String fecha, int id, String estudio, int temporadas) {
		super(nombre, fecha, id,id);
		this.estudio=estudio;
		this.temporadas=temporadas;
	}

	public Serie(String nombre, String fecha, int id,int[] valoraciones , String estudio, int temporadas) {
		super(nombre, fecha,id,id);
		this.estudio=estudio;
		this.temporadas=temporadas;
		this.valoraciones=valoraciones;
	}

	public Serie(String nombre, String fecha, int id,int valoracion , String estudio, int temporadas) {
		super(nombre, fecha,id,valoracion);
		this.estudio=estudio;
		this.temporadas=temporadas;
		this.valoracion=valoracion;
	}
	//getters and setters de los atributos para cambiar los datos
	//y acceder a ellos
	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int[] getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(int[] valoraciones) {
		this.valoraciones = valoraciones;
	}


	//mostramos datos con o sin valoracion o valoraciones
	public String mostrarDatos() {
		return "Nombre: "+nombre+ "\nFecha: "+fecha+
				"\nId: "+id+"\nEstudio: "+estudio+
				"\nTemporadas: "+temporadas;
	}	
	
	
	public String mostrarDatosYValoracion() {
		return "Nombre: "+nombre+ "\nFecha: "+fecha+
				"\nId: "+id+"\nestudio: "+estudio+
				"\nTemporadas: "+temporadas+
				"\nValoracion: "+valoracion;
		
	}
	

	public String mostrarDatosYValoraciones() {
		return "Nombre: "+nombre+ "\nFecha: "+fecha+
				"\nId: "+id+"\nestudio: "+estudio+
				"\nTemporadas: "+temporadas+
				"\nValoraciones: "+valoraciones;
		
	}
	

	
}
