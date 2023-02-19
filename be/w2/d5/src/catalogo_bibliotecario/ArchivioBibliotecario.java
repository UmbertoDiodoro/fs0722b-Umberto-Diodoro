package catalogo_bibliotecario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchivioBibliotecario {

	private static final Logger log = LoggerFactory.getLogger(ArchivioBibliotecario.class);
	private static File file = new File("dir/archivio.txt");

	public static void avvio() throws IOException {
		Scanner scan = new Scanner(System.in);
		 log.info("Benvenuto nell'archivio della biblioteca");
		boolean controllo = true;
		List<Elemento> archivio = new ArrayList<Elemento>();
		while (controllo) {
			try {
				System.out.println("");
				 log.info("ELENCO COMANDI: ");
				 log.info("Esci (0)");
				 log.info("Aggiungi elemento (1)");
				 log.info("Rimuove elemento tramite  (2)");
				 log.info("cerca tramite  (3)");
				 log.info("cerca per anno (4)");
				 log.info("cerca per autore (5)");
				 log.info("salva in locale(6)");
				 log.info("carica da locale (7)");
				int risposta = Integer.parseInt(scan.nextLine());

				switch (risposta) {
				case 0:
					controllo = false;
					log.info("Uscito correttamente");
					break;
				case 1:
					aggiungi(archivio);
					break;
				case 2:
					log.info("fornisci il codice da cancellare");
					int canc = Integer.parseInt(scan.nextLine());
					rimuovi(archivio, canc);
					break;
				case 3:
					log.info("fornisci il codice dell'elemento da cercare");
					int codice = Integer.parseInt(scan.nextLine());
					cercaPerCodice(archivio, codice);
					break;
				case 4:
					log.info("fornisci l'anno per la ricerca");
					int anno = Integer.parseInt(scan.nextLine());
					cercaPerAnno(archivio, anno);
					break;
				case 5:
					log.info("fornisci l'autore per la ricerca");
					String autore = scan.nextLine();
					cercaPerAutore(archivio, autore);
					break;
				case 6:
					salvaInLocale(archivio);
					log.info("Archivio salvato in locale");
					System.out.println("");
					break;
				case 7:
					archivio = caricaDaLocale();
					log.info("Archivio caricato correttamente e disponibile");
					break;
				default:
					log.info("comando sbagliato, usare uno dei comandi concessi");
					System.out.println("");
				}
			} catch (NumberFormatException e) {
				log.info("comando sbagliato, usare uno dei comandi concessi");
				System.out.println("");
			}
		}
	}

	public static void aggiungi(List<Elemento> lista) {
		Scanner scan = new Scanner(System.in);
		log.info("aggiungere libro (1) o  rivista (2)?");
		int scelta = Integer.parseInt(scan.nextLine());
		switch (scelta) {
		case 1:
			log.info("scrivi il codice libro:");
			int codice = Integer.parseInt(scan.nextLine());
			log.info("scrivi il titolo:");
			String titolo = scan.nextLine();
			log.info("scrivi l'anno di pubblicazione:");
			int anno = Integer.parseInt(scan.nextLine());
			log.info("scrivi il numero di pagine:");
			int pagine = Integer.parseInt(scan.nextLine());
			log.info("scrivi l'autore");
			String autore = scan.nextLine();
			log.info("scrivi il genere");
			String genere = scan.nextLine();
			Libro libro = new Libro(autore, genere, codice, titolo, anno, pagine);
			lista.add(libro);
			log.info("Libro aggiunto correttamente");
			break;
		case 2:
			Periodicità per = Periodicità.SETTIMANALE;
			log.info("scegli la periodicità della rivista:");
			log.info("Settimanale(1),Mensile(2),Semestrale(3)");
			int scelta2 = Integer.parseInt(scan.nextLine());
			switch (scelta2) {
			case 1:
				per = Periodicità.SETTIMANALE;
				break;
			case 2:
				per = Periodicità.MENSILE;
				break;
			case 3:
				per = Periodicità.SEMESTRALE;
				break;
			default:
				log.info("errore, necessario selezionare un tipo di periodicit� corretto");
			}
			log.info("scrivi il codice rivista:");
			int codiceRivista = Integer.parseInt(scan.nextLine());
			log.info("scrivi il titolo della rivista:");
			String titoloRivista = scan.nextLine();
			log.info("scrivi l'anno di pubblicazione:");
			int annoRivista = Integer.parseInt(scan.nextLine());
			log.info("scrivi il numero di pagine:");
			int pagineRivista = Integer.parseInt(scan.nextLine());
			Rivista rivista = new Rivista(per, codiceRivista, titoloRivista, annoRivista, pagineRivista);
			lista.add(rivista);
			log.info("Rivista aggiunta correttamente");
			break;
		default:
			log.info("comando sbagliato, usare uno dei comandi concessi");
			System.out.println("");
		}
	}

	public static void rimuovi(List<Elemento> lista, int codice) {
		boolean trovato = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodiceISBN() == codice) {
				Stream<Elemento> streamLista = lista.stream().filter(element -> element.getCodiceISBN() != codice);
				lista = streamLista.collect(Collectors.toList());
				log.info("elemento rimosso correttamente");
				trovato = true;
			}
		}
		if (!trovato) {
			log.info("elemento inesistente");
		}
	}

	public static void cercaPerCodice(List<Elemento> lista, int codice) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> element.getCodiceISBN() == codice);
		List<Elemento> listaone = new ArrayList<Elemento>();
		listaone = streamLista.collect(Collectors.toList());
		if (!listaone.isEmpty()) {
			log.info("ecco il risultato:");
			System.out.println(listaone.get(0).titolo);
		} else {
			log.info("elemento non trovato");
		}

	}

	public static void cercaPerAnno(List<Elemento> lista, int anno) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> element.getAnno() == anno);
		List<Elemento> listaone = new ArrayList<Elemento>();
		listaone = streamLista.collect(Collectors.toList());
		if (!listaone.isEmpty()) {
			log.info("ecco il risultato:");
			listaone.forEach(elem -> System.out.println(elem.getTitolo()));
		} else {
			log.info("nessun elemento trovato");
		}
	}

	public static void cercaPerAutore(List<Elemento> lista, String autore) {
		Stream<Elemento> streamLista = lista.stream().filter(element -> (element.getAutore().equals(autore)));
		List<Elemento> listaone = new ArrayList<Elemento>();
		listaone = streamLista.collect(Collectors.toList());
		if (!listaone.isEmpty()) {
			log.info("ecco il risultato:");
			listaone.forEach(elem -> System.out.println(elem.getTitolo()));
		} else {
			log.info("nessun elemento trovato");
		}
	}

	public static void salvaInLocale(List<Elemento> lista) throws IOException {
		String Stampa = "";
		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) instanceof Libro) {
				Libro libroone = (Libro) lista.get(i);
				Stampa += "libro";
				Stampa += "#";
				Stampa += libroone.getAutore();
				Stampa += "#";
				Stampa += libroone.getGenere();
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getCodiceISBN());
				Stampa += "#";
				Stampa += lista.get(i).getTitolo();
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getAnno());
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getPagine());
				Stampa += "#";
			} else {
				Rivista rivistaone = (Rivista) lista.get(i);
				Stampa += "rivista";
				Stampa += "#";
				if (rivistaone.getPeriodicità() == Periodicità.SETTIMANALE) {
					Stampa += "settimanale";
				} else if (rivistaone.getPeriodicità() == Periodicità.MENSILE) {
					Stampa += "mensile";
				} else {
					Stampa += "semestrale";
				}
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getCodiceISBN());
				Stampa += "#";
				Stampa += lista.get(i).getTitolo();
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getAnno());
				Stampa += "#";
				Stampa += Integer.toString(lista.get(i).getPagine());
				Stampa += "#";
			}
		}
		FileUtils.writeStringToFile(file, Stampa, "UTF-8");
	}

	public static List<Elemento> caricaDaLocale() throws IOException {
		List<Elemento> lista = new ArrayList<Elemento>();
		String letto = FileUtils.readFileToString(file, "UTF-8");
		String array[] = letto.split("#");
		for (int i = 0; i < array.length;) {
			if (array[i].equalsIgnoreCase("libro")) {
				String autore = array[i + 1];
				String genere = array[i + 2];
				int codice = Integer.parseInt(array[i + 3]);
				String titolo = array[i + 4];
				int anno = Integer.parseInt(array[i + 5]);
				int pagine = Integer.parseInt(array[i + 6]);
				Libro libro = new Libro(autore, genere, codice, titolo, anno, pagine);
				lista.add(libro);
				i += 7;
			} else {
				Periodicità per = Periodicità.SETTIMANALE;
				if (array[i + 1] == "settimanale") {
					per = Periodicità.SETTIMANALE;
				} else if (array[i + 1] == "mensile") {
					per = Periodicità.MENSILE;
				} else {
					per = Periodicità.SEMESTRALE;
				}
				int codice = Integer.parseInt(array[i + 2]);
				String titolo = array[i + 3];
				int anno = Integer.parseInt(array[i + 4]);
				int pagine = Integer.parseInt(array[i + 5]);
				Rivista rivista = new Rivista(per, codice, titolo, anno, pagine);
				lista.add(rivista);
				i += 6;
			}
		}
		return lista;
	}

	public static void main(String[] args) throws IOException {
		avvio();
	}

}
