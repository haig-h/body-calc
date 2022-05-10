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

/**This class exports the calculations derived from the other classes and sends them to an Excel spreadsheet.
 *
 */
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
       //     Row r0 = spreadsheet.createRow(0);
        //    r0.createCell(0).setCellValue(InitialInputs.getName());

           /*
            Cell cells = row.createCell(5);
            cells.setCellValue(InitialInputs.getName());
            cells.setCellValue(InitialInputs.getBodyWeight());
            cells.setCellValue(InitialInputs.getHeight());
            cells.setCellValue(InitialInputs.getAge());
            cells.setCellValue(Bmr.getBmr());
        */

       /* for(int i=0;i<columnHeadings.length;i++){
            spreadsheet.autoSizeColumn(i);
        }
        */



        File f = new File("C:\\GitHub Repositories\\body-calc\\Test.xls");
        FileOutputStream fos = new FileOutputStream(f);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("Your file has written!");
    }
}


