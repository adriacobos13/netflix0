package netflix0;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Repository {

			
	public static List<Show> getShows() {
		Show pelicula1= new Pelicula("Avatar", LocalDateTime.of(2020, 12, 8, 8, 30), 123, "Cameron", "2010", 8);
		Show documental1= new Documental("BBC", LocalDateTime.of(2020, 12, 8, 8, 30), 432, "Adria", "2134");
		int[] valoraciones= {1,2,4};
		Show serie1= new Serie("asd", LocalDateTime.of(2020, 12, 8, 8, 30), 1233, valoraciones,"2134" , 5);
		
		return Arrays.asList(pelicula1,documental1,serie1);
		
	}

}
