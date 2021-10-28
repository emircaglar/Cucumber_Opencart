package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_apache_POI_ {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/apachePOI/resoucess/ApacheExcel2(1).xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook1 = WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook1.getSheet("testCitizen");

        int rowcount=sheet.getPhysicalNumberOfRows();
      //  int columncount=sheet.getPhysicalNumberOfCells();
        for (int i = 0; i <rowcount ; i++) {
            Row row1=sheet.getRow(i);
            int columncount=row1.getPhysicalNumberOfCells();
            for (int j = 0; j <columncount ; j++) {
               Cell cell1=row1.getCell(j);
                System.out.print(cell1+" ");
            }
            System.out.println();
        }


    }
}
