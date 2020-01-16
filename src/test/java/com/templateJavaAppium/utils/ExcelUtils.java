package com.templateJavaAppium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    private Workbook wb;
    private Sheet ws;

    /**
     * Opens a excel sheet
     *
     * @param fileName
     *            name of the file where you want data
     * @param sheetName
     *            name of the sheet in the excel file
     */

    public ExcelUtils(String fileName, String sheetName) {
        System.out.println(fileName);
        try {
            File file = new File(fileName);
            System.out.println(file.getAbsolutePath());
            if (fileName.indexOf("xlsx") < 0) { // for .xls format
                wb = new HSSFWorkbook(new FileInputStream(file));
                ws = wb.getSheet(sheetName);
            } else { // for .xlsx format
                wb = new XSSFWorkbook(fileName);
                ws = (XSSFSheet) wb.getSheet(sheetName);
            }
        } catch (IOException io) {
            throw new Error(
                    "Invalid file '" + fileName + "' or incorrect sheet '" + sheetName + "', enter a valid one");
        }
    }

    /**
     * Gets a cell value from the opened sheet
     *
     * @param rowIndex
     *            starting with 0 index
     * @param columnIndex
     *            starting with 0 index
     * @return
     */
    public String getCell(int rowIndex, int columnIndex) {
        String cellValue = null;
        try {
            cellValue = ws.getRow(rowIndex).getCell(columnIndex).toString();
        } catch (Exception e) {
            throw new Error(
                    "The cell with row '" + rowIndex + "' and column '" + columnIndex + "' doesn't exist in the sheet");
        }
        return cellValue;

    }

    //pegar valor numerico
    public int getCell2(int rowIndex, int columnIndex) {
        int cellValue = 0;
        try {
            cellValue = (int) ws.getRow(rowIndex).getCell(columnIndex).getNumericCellValue();


        } catch (Exception e) {
            throw new Error(
                    "The cell with row '" + rowIndex + "' and column '" + columnIndex + "' doesn't exist in the sheet");
        }
        return cellValue;

    }


}