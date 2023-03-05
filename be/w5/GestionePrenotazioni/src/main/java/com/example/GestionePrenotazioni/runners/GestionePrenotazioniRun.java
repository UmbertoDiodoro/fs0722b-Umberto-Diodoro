package com.example.GestionePrenotazioni.runners;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.services.GestionePrenotazioniService;
import com.example.GestionePrenotazioni.utils.Tipo;

@Component
public class GestionePrenotazioniRun implements ApplicationRunner {

	@Autowired
	GestionePrenotazioniService srv;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		Edificio b1 = new Edificio();
		b1.setNome("Spazio - Roma");
		b1.setCitta("Roma");
		b1.setIndirizzo("Via Roma, 38");
		 //srv.EdificioSalva(b1);

		Edificio b2 = new Edificio();
		b2.setNome("Spazio - Torino");
		b2.setCitta("Torino");
		b2.setIndirizzo("Via delle frasche, 85");
		 //srv.EdificioSalva(b2);

		Edificio b3 = new Edificio();
		b3.setNome("Spazio - Milano");
		b3.setCitta("Milano");
		b3.setIndirizzo("Via Milano, 32");
		// srv.EdificioSalva(b3);

		Edificio b4 = new Edificio();
		b4.setNome("Spazio - Firenze");
		b4.setCitta("Firenze");
		b4.setIndirizzo("Via Firenze, 35");
		// srv.EdificioSalva(b4);

		Edificio b5 = new Edificio();
		b5.setNome("Spazio - Bologna");
		b5.setCitta("Bologna");
		b5.setIndirizzo("Via Bologna, 76");
		// srv.EdificioSalva(b5);

		
		Utente u1 = new Utente();
		u1.setNome("Umberto");
		u1.setCognome("Diodoro");
		u1.setEmail("UmbertoDI1999@gmail.com");
		u1.setUsername("GoldenGod");
		// srv.UtenteSalva(u1);

		
		Postazione r1 = new Postazione();
		Edificio build1db = srv.EdificioGetById(1);
		r1.setEdificio(build1db);
		r1.setDescrizione("Postazione di lavoro");
		r1.setTipoSala(Tipo.PRIVATO);
		r1.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r1);

		Postazione r2 = new Postazione();
		r2.setEdificio(build1db);
		r2.setDescrizione("Postazione di lavoro");
		r2.setTipoSala(Tipo.OPENSPACE);
		r2.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r2);

		Postazione r3 = new Postazione();
		Edificio build2db = srv.EdificioGetById(2);
		r3.setEdificio(build2db);
		r3.setDescrizione("Postazione di lavoro");
		r3.setTipoSala(Tipo.SALA_RIUNIONI);
		r3.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r3);

		Postazione r4 = new Postazione();
		Edificio build3db = srv.EdificioGetById(3);
		r4.setEdificio(build3db);
		r4.setDescrizione("Postazione di lavoro");
		r4.setTipoSala(Tipo.PRIVATO);
		r4.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r4);

		Postazione r5 = new Postazione();
		r5.setEdificio(build3db);
		r5.setDescrizione("Postazione di lavoro");
		r5.setTipoSala(Tipo.PRIVATO);
		r5.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r5);

		
		Prenotazione book1 = new Prenotazione();
		Utente u2 = srv.UtenteGetById(1);
		Postazione room1db = srv.PostazioneGetById(1);
		book1.setGiorno(LocalDate.of(2023, 10, 11));
		book1.setUtente(u2);
		book1.setPostazione(room1db);
		// srv.PrenotazioneSalva(book1);

		Edificio btest = srv.EdificioGetById(1);
		Utente utest = srv.UtenteGetById(1);
		Postazione rtest = srv.PostazioneGetById(1);
		Prenotazione booktest = srv.PrenotazioneGetById(1);

		
		Postazione r0 = new Postazione();
		r0.setEdificio(build1db);
		r0.setDescrizione("Postazione di lavoro");
		r0.setTipoSala(Tipo.PRIVATO);
		r0.setNumeroMaxOccupanti(15);
		// srv.PostazioneSalva(r0);

		Prenotazione book0 = new Prenotazione();
		Postazione room2db = srv.PostazioneGetById(2);
		book0.setGiorno(LocalDate.of(2023, 12, 25));
		book0.setUtente(u2);
		book0.setPostazione(room2db);
		// srv.PrenotazioneSalva(book0);

		List<Postazione> listaRoomsFinded = new ArrayList<Postazione>();
		listaRoomsFinded = srv.PostazioneGetByTypeAndCity(Tipo.PRIVATO, "Milano");
		// System.out.println(listaRoomsFinded);

	}

}
