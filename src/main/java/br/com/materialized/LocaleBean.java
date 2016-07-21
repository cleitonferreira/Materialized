package br.com.materialized;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

public class LocaleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Locale currentLocale = new Locale("pt", "BR");
	
	private String bandeira;
	
	@PostConstruct
	public void init() {
		bandeira = "Brasil.png";
	}

	public void portugueseLocale() {
		bandeira = "Brasil.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = new Locale("pt", "BR");
		viewRoot.setLocale(currentLocale);
	}
	
	public void englishLocale() {
		bandeira = "United-States.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = Locale.US;
		viewRoot.setLocale(currentLocale);
	}
	
	public void espanholLocale() {
		bandeira = "Espanha.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = new Locale("es", "ES");
		viewRoot.setLocale(currentLocale);
	}
	
	public void alemaoLocale() {
		bandeira = "Germany.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = Locale.GERMAN;
		viewRoot.setLocale(currentLocale);
	}
	
	public void francesLocale() {
		bandeira = "France.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = Locale.FRANCE;
		viewRoot.setLocale(currentLocale);
	}
	
	public void inglesLocale() {
		bandeira = "United-States.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = Locale.ENGLISH;
		viewRoot.setLocale(currentLocale);
	}
	
	public void italiaLocale() {
		bandeira = "Brasil.png";
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		currentLocale = Locale.ITALIAN;
		viewRoot.setLocale(currentLocale);
	}

	public Locale getCurrentLocale() {
		return currentLocale;
	}

	public String getBandeira() {
		return bandeira;
	}
	
	
}
