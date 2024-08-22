package Poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

//Progaramitacaly write 20 flower names into first sheet ,first col of s excel;
public class assig1 {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent() {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;
        try {
            fout = new FileOutputStream("C:\\Excel\\Worksheet3.xlsx");
            wb = new XSSFWorkbook();
            sh = wb.createSheet("Sheet1");
            for (int i = 1; i <= 20; i++) {
                row = sh.createRow(i-1);
                for (int c = 0; c <= 1; c++) {
                    cell = row.createCell(0);
                    cell.setCellValue("Flowers" +i);
                }
            }
            wb.write(fout);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}