package apachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_apache_POI_column {
    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie ein Zahl");
        Scanner scanner = new Scanner(System.in);
        int suchenZahl = scanner.nextInt();

        String zurückWert = find(suchenZahl);
        System.out.println("zurückWert = " + zurückWert);
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
                    zuruckWert +=row.getCell(suchenZahl)+" ";
        }
        return zuruckWert;
    }
}
