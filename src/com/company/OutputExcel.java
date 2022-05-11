package com.company;
import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.*;

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


            /*
            Not working idk
            String[] dataSet = {InitialInputs.getName(), String.valueOf(InitialInputs.getBodyWeight()), String.valueOf(InitialInputs.getHeight()), String.valueOf(InitialInputs.getAge()), String.valueOf(InitialInputs.getGender()), String.valueOf(Bmr.getBmr())};
            Person p = new Person(InitialInputs.getName(),InitialInputs.getBodyWeight(), InitialInputs.getHeight(),InitialInputs.getAge(), InitialInputs.getGender(), Bmr.getBmr());
            Row r0 = spreadsheet.createRow(1);
            Cell cells = r0.createCell(0, CellType.valueOf(p.name));

            cells.setCellValue(p.name);
            cells.setCellValue(p.bodyWeight);
            cells.setCellValue(p.height);
            cells.setCellValue(p.age);
            cells.setCellValue(p.gender);
            cells.setCellValue(p.bmr);
            */

        for(int i=0;i<columnHeadings.length;i++){
        spreadsheet.autoSizeColumn(i);
        }


        Random random = new Random();
        File f = new File("C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\"+random.nextInt(30)+".xls");
        FileOutputStream fos = new FileOutputStream(f);
        workbook.write(fos);
        fos.close();
        workbook.close();

        System.out.println("Your file has written!");
    }
}


