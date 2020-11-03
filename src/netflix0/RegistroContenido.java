package netflix0;
import javax.swing.JOptionPane;

public class RegistroContenido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("Nº de Shows a añadir: "));
		
		//lista de shows que se iran etiquetando en las diferentes clases hijas.
		Show MisShows[]= new Show[n];
		
		System.out.println("git update"+2);
		System.out.println("git update in features"+2);
		System.out.println("git update in master local");
		
		for (int i=0;i<n;i++) {
			String nombre=JOptionPane.showInputDialog("Nombre Show: "+(i+1));
			String fecha=JOptionPane.showInputDialog("fecha visualización: ");
			int id=Integer.parseInt(JOptionPane.showInputDialog("ID: "));
			String valoracion=JOptionPane.showInputDialog("Quieres valorar?");
			String tipo=JOptionPane.showInputDialog("Serie, Pelicula o Documental? ");
			switch(tipo) {
				case "serie":
					String estudio=JOptionPane.showInputDialog("Estudio: ");
					int temporadas=Integer.parseInt(JOptionPane.showInputDialog("Nº de temporadas: "));
					
					switch(valoracion) {
						case "si":
							String valoraciones=JOptionPane.showInputDialog("Prefieres valorar cada temporada en vez de toda la serie?");
							
							if (valoraciones.equals("si")){				
								int[] puntos= new int[temporadas];		
								for (int j=0;j<temporadas;j++) {
									puntos[j]=Integer.parseInt(JOptionPane.showInputDialog("Puntuacion temporada"+(j+1))); 
								}
								MisShows[i]= new netflix0.Serie(nombre, fecha, id,puntos, estudio, temporadas);		
								}else {
									int punto=Integer.parseInt(JOptionPane.showInputDialog("Puntuacion Serie"));
									MisShows[i]= new netflix0.Serie(nombre, fecha, id,punto, estudio, temporadas);
								}
							break;

						default:
							MisShows[i]= new netflix0.Serie(nombre, fecha, id, estudio, temporadas);
					}
					break;
					
				case "documental":
					String director=JOptionPane.showInputDialog("director: ");
					String publicacion=JOptionPane.showInputDialog("Fecha publicacion: ");
					if (valoracion.equals("si")){
						int punto=Integer.parseInt(JOptionPane.showInputDialog("Puntuacion Documental: "));
						MisShows[i]=new netflix0.Documental(nombre, fecha, id, director, publicacion, punto);
					}else {
						MisShows[i]=new netflix0.Documental(nombre, fecha, id, director, publicacion);
					}
					break;
				
				case "pelicula":
					String director1=JOptionPane.showInputDialog("director: ");
					String publicacion1=JOptionPane.showInputDialog("Fecha publicacion: ");
					if (valoracion.equals("si")){
						int punto=Integer.parseInt(JOptionPane.showInputDialog("Puntuacion Documental: "));
						MisShows[i]=new netflix0.Pelicula(nombre, fecha, id, director1, publicacion1, punto);
					}else {
						MisShows[i]=new netflix0.Pelicula(nombre, fecha, id, director1, publicacion1);
					}
					break;
					
				default:
					i=i-1;
					System.out.println("Tipo no valido, repite");
					
			
			}
			
			
			
		}
	}

}
