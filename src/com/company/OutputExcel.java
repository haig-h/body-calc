package com.company;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class OutputExcel {


    public static void main() throws Exception

    {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Body Calculator");

        String[] columnHeadings = {"Name","Weight","Height","Age","Gender","BMR"};
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);

        Row header = spreadsheet.createRow(0);
        for(int i = 0; i<columnHeadings.length; i++){
            Cell cell = header.createCell(i);
            cell.setCellValue(columnHeadings[i]);
            cell.setCellStyle(headerStyle);
        }
        //7

            /*
            Row row = spreadsheet.createRow(1);
            row.createCell(0).setCellValue(InitialInputs.getName());
            row.createCell(1).setCellValue(InitialInputs.getBodyWeight());
            row.createCell(2).setCellValue(InitialInputs.getHeight());
            row.createCell(3).setCellValue(InitialInputs.getAge());
            row.createCell(4).setCellValue(Bmr.getBmr());
           */

        for(int i=0;i<columnHeadings.length;i++){
            spreadsheet.autoSizeColumn(i);
        }


        File f = new File("C:\\GitHub Repositories\\body-calc\\Test.xls");
        FileOutputStream fos = new FileOutputStream(f);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("Your file has written!");
    }
    private static ArrayList<InitialInputs> data1(){

        return null;
    }
}


