package d4;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente luca = new Dipendente(1112, Dipartimento.PRODUZIONE);
		Dipendente franco = new Dipendente(1232, Dipartimento.PRODUZIONE);
		Dipendente marcello = new Dipendente(3212, 1200, 40, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente damiano = new Dipendente(3213, 2000, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);
		franco.promuovi();
		marcello.promuovi();
		luca.stampaDatiDipendente();
		franco.stampaDatiDipendente();
		marcello.stampaDatiDipendente();
		damiano.stampaDatiDipendente();
		System.out.println(calcolaPaga(luca, 5));
		System.out.println("");
		System.out.println(calcolaPaga(franco, 5));
		System.out.println("");
		System.out.println(calcolaPaga(marcello, 5));
		System.out.println("");
		System.out.println(calcolaPaga(damiano, 5));
	}

	public static double calcolaPaga(Dipendente a) {
		return a.getStipendio();
	}

	public static double calcolaPaga(Dipendente a, int b) {
		return a.getStipendio() + (a.getImportoOrarioStraordinario() * b);
	}

}
