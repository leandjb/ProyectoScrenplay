package com.demoguru99.bank.ProyectoScreenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.demoguru99.bank.ProyectoScreenplay.tasks.OpenTheBrowser;
import com.demoguru99.bank.ProyectoScreenplay.tasks.SetUserName;
import com.demoguru99.bank.ProyectoScreenplay.tasks.Validation;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class loginStepdefinitions {
	
	@Managed(driver = "Chrome")
	private WebDriver herBrowser ;
	
	private Actor edwar = Actor.named("Edwar");
	
	@Before
	public void setup() {
		edwar.can(BrowseTheWeb.with(herBrowser));
		
		
	}
	
	@Given("^edwar quiere ingresar a la pagina home$")
	public void quieroIngresarALaPaginaHome() {
	 edwar.wasAbleTo(OpenTheBrowser.on());
	}


	@When("^ingresa idusuario y la clave (.*),(.*)$")
	public void ingresoMiUsuarioYLaClave(String usuario, String contrasena) {
	 // digitar los campos Ususario y la Contrasena
		System.out.println(usuario);
		edwar.attemptsTo(SetUserName.Send());
	}

	@Then("^debo poder ver la pagina de mi perfil$")
	public void deboPoderVerLaPaginaDeMiPerfil() {
		edwar.attemptsTo(Validation.verificar());
		// poder ingresar a la pagina home de mi perfil 
	  	}

	
	

	public Actor getEdwar() {
		return edwar;
	}


	public void setEdwar(Actor edwar) {
		this.edwar = edwar;
	}



}
