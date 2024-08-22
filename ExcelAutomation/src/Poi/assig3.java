package Poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

//Progaramitacaly write 20 flower names their resp colors in first and 2nd col;
public class assig2 {
    public static void main(String[] args) {
        writeContent1();
    }
    private static void writeContent1() {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;
        try {
            fout = new FileOutputStream("C:\\Excel\\Worksheet4.xlsx");
            wb = new XSSFWorkbook();
            sh = wb.createSheet("Sheet1");
            for (int i = 1; i <= 20; i++) {

                row = sh.createRow(i-1);
                cell= row.createCell(0);
                cell.setCellValue("Flowers" +i);

                cell=row.createCell(1);
                cell.setCellValue("Color"+i);
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