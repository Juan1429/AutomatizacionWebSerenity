package com.advantageonlineshopping.tasks;

import com.advantageonlineshopping.interactions.ReadAndWriteExcel;
import com.advantageonlineshopping.uis.InterfazUsuarioCompra;
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

public class Compra implements Task {
    Excel excel = new Excel();
    @Override
    public <T extends Actor> void performAs(T actor){

        //Steps and actions to Register On Page
        try {
                    actor.attemptsTo(
                            WaitUntil.the(InterfazUsuarioCompra.BTN_USER, isVisible()).forNoMoreThan(5).seconds(),
                            JavaScriptClick.on(InterfazUsuarioCompra.BTN_USER),
                            WaitUntil.the(InterfazUsuarioCompra.TXT_USER_NAME, isVisible()).forNoMoreThan(5).seconds(),
                            Enter.theValue(excel.leerDatoExcel("Login", "Data.xlsx", 1, 0)).into(InterfazUsuarioCompra.TXT_USER_NAME),
                            Enter.theValue(excel.leerDatoExcel("Login", "Data.xlsx", 1, 1)).into(InterfazUsuarioCompra.TXT_PASSWORD),
                            WaitUntil.the(InterfazUsuarioCompra.BTN_SIGN_IN, isVisible()).forNoMoreThan(5).seconds(),
                            JavaScriptClick.on(InterfazUsuarioCompra.BTN_SIGN_IN),
                            WaitUntil.the(InterfazUsuarioCompra.BTN_IMG, isVisible()).forNoMoreThan(5).seconds(),
                            Click.on(InterfazUsuarioCompra.BTN_IMG),
                            WaitUntil.the(InterfazUsuarioCompra.TXT_PRODUCT1, isVisible()).forNoMoreThan(5).seconds(),
                            ReadAndWriteExcel.on(1,0,InterfazUsuarioCompra.TXT_PRODUCT1),
                            ReadAndWriteExcel.on(2,0,InterfazUsuarioCompra.TXT_PRODUCT2),
                            ReadAndWriteExcel.on(3,0,InterfazUsuarioCompra.TXT_PRODUCT3),
                            ReadAndWriteExcel.on(4,0,InterfazUsuarioCompra.TXT_PRODUCT4),
                            ReadAndWriteExcel.on(5,0,InterfazUsuarioCompra.TXT_PRODUCT5),
                            ReadAndWriteExcel.on(6,0,InterfazUsuarioCompra.TXT_PRODUCT6),
                            ReadAndWriteExcel.on(7,0,InterfazUsuarioCompra.TXT_PRODUCT7),
                            ReadAndWriteExcel.on(8,0,InterfazUsuarioCompra.TXT_PRODUCT8),
                            ReadAndWriteExcel.on(9,0,InterfazUsuarioCompra.TXT_PRODUCT9),
                            ReadAndWriteExcel.on(10,0,InterfazUsuarioCompra.TXT_PRODUCT10),
                            ReadAndWriteExcel.on(11,0,InterfazUsuarioCompra.TXT_PRODUCT11),
                            Click.on(InterfazUsuarioCompra.TXT_PRODUCT3),
                            WaitUntil.the(InterfazUsuarioCompra.BTN_AGGCAR, isVisible()).forNoMoreThan(5).seconds(),
                            Click.on(InterfazUsuarioCompra.BTN_AGGCAR),
                            WaitUntil.the(InterfazUsuarioCompra.BTN_CAR, isVisible()).forNoMoreThan(5).seconds(),
                            Click.on(InterfazUsuarioCompra.BTN_CAR),
                            WaitUntil.the(InterfazUsuarioCompra.BTN_CHECKOUT, isVisible()).forNoMoreThan(5).seconds(),
                            Click.on(InterfazUsuarioCompra.BTN_CHECKOUT)


            );
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


    //These Methods are called for StepDefinitions Action
    public static Compra enAdvantage() {
        return Instrumented.instanceOf(Compra.class).withProperties();
    }


}
