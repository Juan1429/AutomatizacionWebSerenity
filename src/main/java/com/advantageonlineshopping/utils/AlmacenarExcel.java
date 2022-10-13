package com.advantageonlineshopping.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlmacenarExcel {

    /**
     * Toma una ruta de archivo, un nombre de hoja, un número de fila, un número de celda y una cadena como parámetros, y escribe la cadena en
     * la celda especificada
     *
     * @param filepath La ruta al archivo de Excel.
     * @param sheetName El nombre de la hoja en la que desea escribir.
     * @param rowNumber El número de fila donde se encuentra la celda.
     * @param cellNumber El número de columna de la celda en la que desea escribir.
     * @param ResultText El valor que desea escribir en la celda.
     */
    public void writeCellValue(String filepath, String sheetName, int rowNumber, int cellNumber, String ResultText) throws IOException {

        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);

        XSSFSheet newSheet = newWorkbook.getSheet(sheetName);

        XSSFRow row = newSheet.getRow(rowNumber);

        XSSFCell celda = row.createCell(cellNumber);

        celda.setCellValue(ResultText);

        System.out.println("valor de la Celda... "+celda.getStringCellValue());

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file);

        newWorkbook.write(outputStream);

        outputStream.close();


    }



}
