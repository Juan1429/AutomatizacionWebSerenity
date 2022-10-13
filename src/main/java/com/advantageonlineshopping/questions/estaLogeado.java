package com.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.BaseTarget;

import static com.advantageonlineshopping.uis.InterfazUsuario.VALIDATE_REGISTER;


public class estaLogeado implements  Question<String> {


    // Con la ayuda de este método obtiene el texto en Xpath de inicio de sesión para usarlo en el método de comparación
    @Override
    public String answeredBy(Actor actor) {return VALIDATE_REGISTER.resolveFor(actor).getText(); }

    public static Question<String> onTheSite() {
        return new estaLogeado();
    }

}
