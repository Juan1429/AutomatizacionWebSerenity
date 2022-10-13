package com.advantageonlineshopping.stepDefinitions;

import com.advantageonlineshopping.drivers.ChromeDriver;
import com.advantageonlineshopping.questions.estaLogeado;
import com.advantageonlineshopping.tasks.Registro;
import com.advantageonlineshopping.utils.Excel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.io.IOException;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistroStepDefinitions {



    Excel excel = new Excel();
    @Before
    // Setting the stage for the actors.
    public void before(){OnStage.setTheStage(new OnlineCast());}


    @Given("^que ingreso a la pagina advantageonlineshopping$")
    public void queIngresoALaPaginaAdvantageonlineshopping() throws IOException {
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(ChromeDriver.ChromeWebDriver().on(excel.leerDatoExcel("Dominios", "Data.xlsx", 1, 0))));
    }


    @When("^voy a registrarme en advantageonlineshopping$")
    public void voyARegistrarmeEnAdvantageonlineshopping() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.enAdvantage());

    }

    @Then("^podre registrarme exitosamente en advantageonlineshopping$")
    public void podreRegistrarmeExitosamenteEnAdvantageonlineshopping()throws IOException {
        OnStage.theActorInTheSpotlight().should(seeThat(estaLogeado.onTheSite(),
                equalTo(excel.leerDatoExcel("Credenciales", "Data.xlsx", 1, 0))));
    }



}
