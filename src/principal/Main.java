package principal;

import Controlador.SocioControlador;
import Vista.FormularioSocio;
import Vista.GestionSocios;
import Vista.Principal;
import modelo.Config;
import modelo.Socio_modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//Sortu modelo.
		Socio_modelo socioModelo = new Socio_modelo();
		
		//Sortu controlador.
		SocioControlador socioControlador = new SocioControlador();
		
		//Sortu leihoak.
		Principal principal = new Principal();
		GestionSocios gestionSocios = new GestionSocios(principal,true);
		FormularioSocio formularioSocio = new FormularioSocio(gestionSocios,true);
		
		//Leihoei controladoreak ezarri, horrela erlazionatuta egongo dira.
		principal.setSocioControlador(socioControlador);
		gestionSocios.setSocioControlador(socioControlador);
		formularioSocio.setSocioControlador(socioControlador);
		
		//Controladoreari leiho eta modeloak asignatu.
		socioControlador.setPrincipal(principal);
		socioControlador.setGestionSocios(gestionSocios);
		socioControlador.setFormularioSocio(formularioSocio);
		socioControlador.setSocioModelo(socioModelo);
		
		principal.setVisible(true);
		
	}

}
