package com.gadzik.DodawanieUzytkownika;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private OsobaService osobaService;

	public void setOsobaService(OsobaService osobaService) {
		this.osobaService = osobaService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView metoda0(){
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	@RequestMapping(value = "/wprowadzUsera", method = RequestMethod.GET)
	public ModelAndView metoda1(){
		ModelAndView model = new ModelAndView("wprowadzenie");
		model.addObject("KOMENDA" , new Osoba());
		return model;
	}
	@RequestMapping(value = "/dodawanie", method = RequestMethod.POST)
	public ModelAndView metoda2(@ModelAttribute("KOMENDA") Osoba o){
		ModelAndView model = new ModelAndView("redirect:/wprowadzUsera");
		this.osobaService.dodaj(o);
		return model;
	}
	@RequestMapping(value = "/widok", method = RequestMethod.GET)
	public ModelAndView metoda3(){
		ModelAndView model = new ModelAndView("widoczek");
		model.addObject("listaaosob", this.osobaService.listaosob());
		return model;
	}
	@RequestMapping(value = "/usuwanie/{id}")
	public ModelAndView metoda3(@PathVariable("id") int id){
		ModelAndView model = new ModelAndView("redirect:/widok");
		this.osobaService.usun(id);
		return model;
	}
	
}
