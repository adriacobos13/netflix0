package netflix0;

public class Show {
	protected String nombre;
	protected String fecha;
	protected int id;
	protected int valoracion;
	
	
	public Show(String nombre,String fecha,int id, int valoracion) {
		
		this.fecha=fecha;
		this.nombre=nombre;
		this.id=id;
		
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
	
		
	

}
