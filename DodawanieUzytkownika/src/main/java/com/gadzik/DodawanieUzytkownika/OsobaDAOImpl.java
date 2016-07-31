package com.gadzik.DodawanieUzytkownika;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class OsobaDAOImpl implements OsobaDAO {
	
	@Autowired
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sesf) {
		this.sessionfactory = sesf;
	}

	@Override
	public void dodaj(Osoba o) {
		Session session = this.sessionfactory.getCurrentSession();
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Osoba> listaosob() {
		Session session = this.sessionfactory.getCurrentSession();
		session.beginTransaction();
		List<Osoba> lista = session.createQuery("from Osoba").list();
		session.getTransaction().commit();
		return lista;
	}

	@Override
	public void usun(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		session.beginTransaction();
		Osoba o = (Osoba) session.load(Osoba.class, new Integer(id));
		session.delete(o);
		session.getTransaction().commit();
	}
	
	
}
