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

}
