package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _03_apache_POI_suchen {
    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie ein Wort");
        Scanner scanner = new Scanner(System.in);
        String suchenWort = scanner.nextLine();

        String zurückWert = find(suchenWort);
        System.out.println("zurückWert = " + zurückWert);
    }

    public static String find(String suchenWort) {
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
            int cellCount = row.getPhysicalNumberOfCells();
            for (int j = 1; j < cellCount; j++) {

                if (row.getCell(0).toString().equals(suchenWort)) {

                    zuruckWert += row.getCell(j)+" ";
                }
            }
        }
        return zuruckWert;
    }
}
