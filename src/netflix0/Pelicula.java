package netflix0;

public class Pelicula extends Show{
	//atributos
	private String director;
	private String publicacion;
	private int valoracion;
	
	//Metodo constructor 1
	public Pelicula(String nombre, String fecha, int id, String director, String publicacion, int valoracion) {
		super(nombre,fecha,id);
		this.director=director;
		this.publicacion=publicacion;
		this.valoracion=valoracion;
	
	}
	
	//Metodo constructor 2 sin valoracion
	public Pelicula(String nombre, String fecha, int id, String director, String publicacion) {
		super(nombre,fecha,id);
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


	public int getValoracion() {
		return valoracion;
	}

	
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
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
