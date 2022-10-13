package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.uis.InterfazUsuario;
import com.advantageonlineshopping.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registro implements Task {

    Excel excel = new Excel();
    @Override
    public <T extends Actor> void performAs(T actor) {

        //Steps and actions to Register On Page
        try {
            actor.attemptsTo(
                    //Wait for Button is clickable
                    WaitUntil.the(InterfazUsuario.BTN_MENU_USER, isVisible()).forNoMoreThan(5).seconds(),
                    JavaScriptClick.on(InterfazUsuario.BTN_MENU_USER),
                    //Wait for Button is clickable
                    WaitUntil.the(InterfazUsuario.BTN_CREATE_ACCOUNT, isVisible()).forNoMoreThan(5).seconds(),
                    JavaScriptClick.on(InterfazUsuario.BTN_CREATE_ACCOUNT),
                    //Wait for Labels is Displayed
                    WaitUntil.the(InterfazUsuario.TXT_USERNAME, isVisible()).forNoMoreThan(5).seconds(),
                    //Actions to the Formulary
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx", 1, 0)).into(InterfazUsuario.TXT_USERNAME),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx", 1, 1)).into(InterfazUsuario.TXT_EMAIL),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx", 1, 2)).into(InterfazUsuario.TXT_PASSWORD),
                    Enter.theValue(excel.leerDatoExcel("Credenciales","Data.xlsx",1,3)).into(InterfazUsuario.TXT_CONFIRM_PASSWORD),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,4)).into(InterfazUsuario.TXT_NAME),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,5)).into(InterfazUsuario.TXT_LASTNAME),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,6)).into(InterfazUsuario.TXT_PHONE),
                    //Actions and Waits for DropDownList Items
                    Click.on(InterfazUsuario.BTN_COUNTRY),
                    WaitUntil.the(InterfazUsuario.VALIDATE_DROPDOWN, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(InterfazUsuario.LI_ITEM),
                    //Continue diligence the formulary
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,7)).into(InterfazUsuario.TXT_CITY),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,8)).into(InterfazUsuario.TXT_ADDRESS),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,9)).into(InterfazUsuario.TXT_STATE),
                    Enter.theValue(excel.leerDatoExcel("Credenciales", "Data.xlsx",1,10)).into(InterfazUsuario.TXT_POSTAL),
                    JavaScriptClick.on(InterfazUsuario.BOX_ACCEPT),
                    JavaScriptClick.on(InterfazUsuario.BTN_REGISTER),
                    //Wait for the Icon logged is displayed
                    WaitUntil.the(InterfazUsuario.VALIDATE_REGISTER, isVisible()).forNoMoreThan(30).seconds()
            );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    //These Methods are called for StepDefinitions Action
    public static Registro enAdvantage() {
        return Instrumented.instanceOf(Registro.class).withProperties();
    }

}
