package netflix0;
import modelo.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Repository {

			
	public static List<Show> getShows() {
		Show pelicula1= new Pelicula("Project X",LocalDateTime.of(2020, 12, 8, 8, 30), 123, "Alberto Alvarez", LocalDateTime.of(2002, 3,4,1,40));
		Show pelicula2= new Pelicula("El Renacido", LocalDateTime.of(2020, 12, 8, 9, 30), 465, "Leonardo DiCaprio", 9, LocalDateTime.of(2018, 7,2,0,0));
		Show serie1=new Serie("FullMetal Alchemist", LocalDateTime.of(2018, 12, 8, 9, 30), 325, "Bones", 1, LocalDateTime.of(2015, 7,2,0,0));
		Show serie2=new Serie("Breaking Bad", LocalDateTime.of(2017,2,3,2,20), 111, 9, "BBC", 8,LocalDateTime.of(2011, 9,2,0,0));
		int[] valoraciones= {10,10,10,10,10};
		Show serie3=new Serie("JoJo's Bizarre Adventure",LocalDateTime.of(2018,6,7,2,20), 180,valoraciones, "David Production",5 ,LocalDateTime.of(2013,5,1,0,0));
		Show documental=new Documental("La vida sedentaria de un abuelo",LocalDateTime.of(1999,1,7,2,20), 666, "Adriato Yagare", LocalDateTime.of(2013,5,1,0,0));
		
		
		return Arrays.asList(pelicula1,pelicula2,serie1,serie2,serie3,documental);
		
	}

}
