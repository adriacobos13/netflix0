package netflix0;

public class Documental extends Show{
	//atributos documental  
	private String director;
	private String publicacion;
	
	
	//metodo constructor 1 con valoracion
	public Documental(String nombre, String fecha, int id, String director, String publicacion, int valoracion) {
		super(nombre,fecha,id,valoracion);
		this.director=director;
		this.publicacion=publicacion;
		this.valoracion=valoracion;
		
	}
	//metodo constructor 1 sin valoracion
	public Documental(String nombre, String fecha, int id, String director, String publicacion) {
		super(nombre,fecha,id, id);
		this.director=director;
		this.publicacion=publicacion;
	
	}
	
	//metodos getters y setters para acceder o cambiar datos
	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getPublicacion() {
		return publicacion;
	}


	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}


	
	//mostramos datos con o sin valoracion
	public String mostrarDatos() {
		return "Nombre: "+nombre+ "\nFecha: "+fecha+
				"\nId: "+id+"\nDirector: "+director+
				"\nPublicacion: "+publicacion;
	}	
	
	public String mostrarDatosYValoracion() {
		return "Nombre: "+nombre+ "\nFecha: "+fecha+
				"\nId: "+id+"\nDirector: "+director+
				"\nPublicacion: "+publicacion+
				"\nValoracion: "+valoracion;
		
	}
	
	
	

}
