package apachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_apache_POI_neu_Excel {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Tabelle1");

        Row row = xssfSheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("ipod");

        FileOutputStream fileOutputStream=new FileOutputStream("src/test/java/apachePOI/resoucess/neuExcel.xlsx");
        xssfWorkbook.write(fileOutputStream);
        xssfWorkbook.close();
        fileOutputStream.close();




    }

    public static String find(int suchenZahl) {
        String zuruckWert = "";
        Workbook workbook = null;

        String path = "src/test/java/apachePOI/resoucess/ApacheExcel2(1).xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheet("testCitizen");
        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();

            if(cellCount>suchenZahl)
                    zuruckWert +=row.getCell(suchenZahl)+" ";
        }
        return zuruckWert;
    }
}
