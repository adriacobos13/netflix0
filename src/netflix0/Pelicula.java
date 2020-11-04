package netflix0;

public class Pelicula extends Show{
	//atributos
	private String director;
	private String publicacion;
	
	
	//Metodo constructor 1
	public Pelicula(String nombre, String fecha, int id, String director, String publicacion, int valoracion) {
		super(nombre,fecha,id, valoracion);
		this.director=director;
		this.publicacion=publicacion;
		
	
	}
	
	//Metodo constructor 2 sin valoracion
	public Pelicula(String nombre, String fecha, int id, String director, String publicacion) {
		super(nombre,fecha,id,id);
		this.director=director;
		this.publicacion=publicacion;
		
	}
	

	//getters and setters de los atributos para cambiar los datos
	//y acceder a ellos
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
