package Controlador;

import Vista.FormularioSocio;
import Vista.GestionSocios;
import Vista.Principal;
import modelo.Socio_modelo;

public class SocioControlador {

	private Principal principal;
	private GestionSocios gestionSocios;
	private FormularioSocio formularioSocio;
	private Socio_modelo socioModelo;
	
	
	
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public GestionSocios getGestionSocios() {
		return gestionSocios;
	}
	public void setGestionSocios(GestionSocios gestionSocios) {
		this.gestionSocios = gestionSocios;
	}
	public FormularioSocio getFormularioSocio() {
		return formularioSocio;
	}
	public void setFormularioSocio(FormularioSocio formularioSocio) {
		this.formularioSocio = formularioSocio;
	}
	public Socio_modelo getSocioModelo() {
		return socioModelo;
	}
	public void setSocioModelo(Socio_modelo socioModelo) {
		this.socioModelo = socioModelo;
	}
	
}
