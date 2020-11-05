package netflix0;

import java.util.List;

import javax.swing.JOptionPane;

public class RegistroContenido {

	public static void main(String[] args) {

		List<Show> shows = Repository.getShows();
		shows.forEach(x -> System.out.println(x.mostrarDatosYValoracion()));
		for (final Show show : shows) {
			System.out.println(show);
		}
		shows.forEach(show -> System.out.println(show.toString()));
		shows.forEach(System.out::println);

	}

}
