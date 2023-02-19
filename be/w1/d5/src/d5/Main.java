package d5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int decisione = 0;

		Scanner input = new Scanner(System.in);

		Multimedia array[] = new Multimedia[5];

		int nuovoElemento = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Premi 1 per inserire un Elemento Multimediale: VIDEO");
			System.out.println("Premi 2 per inserire un Elemento Multimediale: AUDIO");
			System.out.println("Premi 3 per inserire un Elemento Multimediale: IMMAGINE");
			nuovoElemento = Integer.parseInt(input.nextLine());
			if (nuovoElemento == 1) {

				System.out.println("inserisci Titolo Video");
				String titolo = input.nextLine();
				System.out.println("inserisci Durata Video");
				int durata = Integer.parseInt(input.nextLine());
				System.out.println("inserisci Volume Video");
				int volume = Integer.parseInt(input.nextLine());
				System.out.println("inserisci Luminosità Video");
				int luminosità = Integer.parseInt(input.nextLine());
				array[i] = new Video(titolo, durata, volume, luminosità);
			} else if (nuovoElemento == 2) {

				System.out.println("inserisci Titolo Video");
				String titolo = input.nextLine();
				System.out.println("inserisci Durata Video");
				int durata = Integer.parseInt(input.nextLine());
				System.out.println("inserisci Volume Video");
				int volume = Integer.parseInt(input.nextLine());
				array[i] = new Audio(titolo, durata, volume);
			} else if (nuovoElemento == 3) {

				System.out.println("inserisci Titolo Video");
				String titolo = input.nextLine();
				System.out.println("inserisci Luminosità Video");
				int luminosità = Integer.parseInt(input.nextLine());
				array[i] = new Immagine(titolo, luminosità);
			} else {
				System.out.println("errore");
				i--;
			}
		}

		System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
		System.out.println("Premere 0 chiudere il Player Multimediale.");

		decisione = Integer.parseInt(input.nextLine());

		while (decisione != 0) {
			if (decisione == 1) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}

			}
			if (decisione == 1) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}

			}
			if (decisione == 2) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}

			}
			if (decisione == 3) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}

			}
			if (decisione == 4) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}

			}
			if (decisione == 5) {
				String classe = array[--decisione].getClass().toString();
				if (classe.contains("Video")) {
					Video video = (Video) array[decisione];
					video.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}
				if (classe.contains("Audio")) {
					Audio audio = (Audio) array[decisione];
					audio.play();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				} else if (classe.contains("Immagine")) {
					Immagine immagine = (Immagine) array[decisione];
					immagine.Show();
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());
				}else {
					System.out.println("errore valore non valido");
					System.out.println("Premere un valore da 1 a 5 per consultare un Elemento Multimediale");
					System.out.println("Premere 0 chiudere il Player Multimediale.");

					decisione = Integer.parseInt(input.nextLine());

				}
				
			}
		}
			System.out.println("sei uscito dal player");
	}
}
