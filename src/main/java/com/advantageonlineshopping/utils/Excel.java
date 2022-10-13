package com.advantageonlineshopping.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {

    private XSSFWorkbook book;
    private FileInputStream file;



    /**
     * Lee una celda de un archivo de Excel y devuelve el valor de esa celda
     *
     * hoja El nombre de la hoja que desea leer.
     * ruta La ruta del archivo de Excel.
     * rowValue El número de fila donde se encuentran los datos.
     * cellValue El número de columna de la celda que desea leer.
     * @return El valor de la celda.
     */
    public String leerDatoExcel(String hoja, String ruta, int rowValue, int cellValue) throws IOException {

        String valor;
        file = new FileInputStream(new File(ruta));
        book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        book.close();
        file.close();
        return valor;
    }
}
