package com.company;

import java.io.File;
import java.lang.Class;
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

import static com.company.InitialInputs.*;

/**This class exports the calculations derived from the other classes and sends them to an Excel spreadsheet.
 */
public class OutputExcel {

    /**This is the main method for the class, and it sends the calculated numbers to the Excel spreadsheet if the user chooses.
     * @throws Exception
     */



    public static void main() throws Exception {
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



            String[] dataSet = {InitialInputs.getName(), String.valueOf(InitialInputs.getBodyWeight()), String.valueOf(InitialInputs.getHeight()), String.valueOf(InitialInputs.getAge()), String.valueOf(InitialInputs.getGender()), String.valueOf(Bmr.getBmr())};

            Row r0 = spreadsheet.createRow(1);
            Cell cells = r0.createCell(-1);

            for(int i = 0; i < dataSet.length; i++) {
                    cells.setCellValue(dataSet[i]);
            }



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
}


