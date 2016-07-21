package br.com.materialized;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MenuBean {
	
	private String pagina = "pagina1.xhtml";
	
	
	// esse metodo voce coloca no botao ou link que vc quer q troque a pagina
	public void pagina1() {
		System.out.println("Página 1");
		setPagina("pagina1.xhtml");
	}
	public void pagina2() {
		System.out.println("Página 2");
		setPagina("pagina2.xhtml");
	}
	
	
	
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	
}
