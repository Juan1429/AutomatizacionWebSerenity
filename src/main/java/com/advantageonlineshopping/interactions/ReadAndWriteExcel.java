package com.advantageonlineshopping.interactions;

import com.advantageonlineshopping.utils.AlmacenarExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;

public class ReadAndWriteExcel implements Task {

    Target element;
    private int  Columna, Celda;
    public ReadAndWriteExcel(int Columna, int Celda, Target element) {
        this.Columna = Columna;
        this.Celda = Celda;
        this.element = element;
    }


    /**
     * Almacena el valor del elemento en un archivo de Excel.
     *
     * @param actor El actor que está realizando la tarea.
     */

    @Override
    public <T extends Actor> void performAs(T actor) {
        AlmacenarExcel guardar = new AlmacenarExcel();
        String filePath = "C:\\Users\\Usuario\\Escritorio\\RetoCampusQA\\RetoCampus_AutomatizacionWeb\\Data.xlsx";
        String hoja = "Laptos";

        String num = element.resolveFor(actor).getText();

        try {
            guardar.writeCellValue(filePath,hoja, Columna, Celda, num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Performable on(int Columna, int Celda, Target element){
        return Instrumented.instanceOf(ReadAndWriteExcel.class).withProperties(Columna,Celda,element);
    }
}



