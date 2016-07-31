package com.gadzik.DodawanieUzytkownika;

import java.util.List;

public interface OsobaDAO {
	public void dodaj(Osoba o);
	public List<Osoba> listaosob();
	public void usun(int id);

}
