package com.demoaut.newtours.step_definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoaut.newtours.gui.HomePage;
import com.demoaut.newtours.models.Usuario;
import com.demoaut.newtours.questions.FechaVerificada;
import com.demoaut.newtours.tasks.RegisterTask;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

public class CommonStep {

	@Managed
	WebDriver driver;

	@Before
	public void inicio() {

		System.setProperty("webdriver.chrome.driver", "E:\\DriversSelenium\\chromedriver78.exe");
		driver = new ChromeDriver();

		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Daniel");
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
		OnStage.theActorInTheSpotlight().attemptsTo(Open.url("http://newtours.demoaut.com/mercurywelcome.php"));
		driver.manage().window().maximize();
	}

	@Given("^Me encuentro en la pagina mercury tours$")
	public void meEncuentroEnLaPaginaMercuryTours() {
		OnStage.theActorInTheSpotlight().attemptsTo(Click.on(HomePage.HOME));
	}

	@When("^Digilencio el formulario de registro$")
	public void digilencioElFormularioDeRegistro(List<Usuario> dato) {
		Usuario.GuardarDatosDelUsuario(dato.get(0));
		OnStage.theActorInTheSpotlight().attemptsTo(Click.on(HomePage.REGISTER), RegisterTask.exitoso());
	}

	@Then("^Se verifica la fecha$")
	public void seVerificaLaFecha() {		
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FechaVerificada.completa()));
	}

	@After
	public void cerrar() {
		driver.quit();
	}

}
