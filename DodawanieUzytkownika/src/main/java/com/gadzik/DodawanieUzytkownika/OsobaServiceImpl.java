package com.gadzik.DodawanieUzytkownika;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OsobaServiceImpl implements OsobaService{
	
	@Autowired
	private OsobaDAO osobaDAO;

	public void setOsobaDAO(OsobaDAO osobaDAO) {
		this.osobaDAO = osobaDAO;}

	@Override
	public void dodaj(Osoba o) {
		this.osobaDAO.dodaj(o);
	}
	@Override
	public List<Osoba> listaosob() {
		return this.osobaDAO.listaosob();
	}
	@Override
	public void usun(int id) {
		this.osobaDAO.usun(id);
	}
	
	

}
