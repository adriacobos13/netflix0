package netflix0;

public class Show {
	protected String nombre;
	protected String fecha;
	protected int id;
	
	public Show(String nombre,String fecha,int id) {
		
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

	
		
	

}
