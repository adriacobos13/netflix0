package netflix0;
import modelo.*;

import java.time.LocalDateTime;
import java.util.List;


public class RegistroContenido {

	public static void main(String[] args) {
		List<Show> shows = Repository.getShows();
		shows.forEach(x -> System.out.println(x.toString()));
		
		
		shows.get(0).setValoracion(10);
		System.out.println("valoracion añadida: " + shows.get(0).toString());
		
		
		
		Show pelicula3= new Pelicula("Your Name",LocalDateTime.of(2020, 12, 8, 8, 30), 123, "El Bicho", LocalDateTime.of(20013, 3,4,1,40));
		shows.add(pelicula3);
		
		
	}

}
