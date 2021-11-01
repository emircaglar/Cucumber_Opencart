package Utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<List<String>> getList(String path, String sheetName, int columnCount) {

        List<List<String>> returnList = new ArrayList<>();

        Workbook workbook = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <rowCount ; i++) {
            List<String> rowList=new ArrayList<>();
            Row row = sheet.getRow(i);

            for (int j = 0; j <columnCount ; j++) {
                rowList.add(row.getCell(j).toString());
            } 
            returnList.add(rowList);
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<List<String>> listexcel = getList("src/test/java/apachePOI/resoucess/neuExcel.xlsx", "Tabelle1",  1);
        System.out.println("listexcel = " + listexcel);
    
    }


}
