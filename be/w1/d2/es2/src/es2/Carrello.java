package es2;

public class Carrello {
	Cliente clienteAssociato;
	Articolo elencoArticoli[];
	double totaleCostoArticoli = 0;

	public Carrello(Cliente a, Articolo b[]) {
		this.clienteAssociato = a;
		this.elencoArticoli = b;
		for (int i = 0; i < b.length; i++) {
			this.totaleCostoArticoli += b[i].prezzo;
		}
	}

}
