package com.advantageonlineshopping.stepDefinitions;

import com.advantageonlineshopping.drivers.ChromeDriver;
import com.advantageonlineshopping.tasks.Compra;
import com.advantageonlineshopping.uis.InterfazUsuarioCompra;
import com.advantageonlineshopping.utils.Excel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.core.IsEqual.equalTo;

public class CompraStepDefinitions {



    Excel excel = new Excel();
    @Before
    // Setting the stage for the actors.
    public void before(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^que navego en la pagina advantageonlineshopping$")
    public void queNavegoEnLaPaginaAdvantageonlineshopping() throws IOException {
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(ChromeDriver.ChromeWebDriver().on(excel.leerDatoExcel("Dominios", "Data.xlsx", 1, 0))));
    }

    @When("^inicio sesion en advantageonlineshopping$")
    public void inicioSesionEnAdvantageonlineshopping() {
        OnStage.theActorInTheSpotlight().attemptsTo(Compra.enAdvantage());
    }

    @Then("^podre comprar exitosamente en advantageonlineshopping$")
    public void podreComprarExitosamenteEnAdvantageonlineshopping() throws IOException {
        WaitUntil.the(InterfazUsuarioCompra.TXT_PRODUCT3, isVisible()).forNoMoreThan(5).seconds();
    }




}
