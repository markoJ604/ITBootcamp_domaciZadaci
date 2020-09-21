package xDomaci22;
/*
Napraviti klasu za citanje excel tabele koja poseduje metodu koja kreira potreban tok podataka kojoj se prosledjuje putanja
do fajla i metodu kojoj se prosledjuju dva cela broja (jedan za red, drugi za kolonu u tabeli).

Koristeci istu klasu, pristupiti tabeli i citati podatke koji se nalaze u zadatom redu i koloni.

Dodatak: Nadograditi klasu da omogucava i unos podataka u zadati red i kolonu.
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TableReader {

    public static XSSFWorkbook wb;
    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static Sheet sheet;
    private static Row row;
    private static Cell cell;

    public static void tableReader (String pathToFile, int sheetNo) throws Exception {
        fis = new FileInputStream(pathToFile);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetNo);

    }

    public static void createRow (int rowNo){
        row = sheet.createRow(rowNo);
    }

    public static Row getRow (int rowNo){
        return row;
    }

    public static void createCell (int rowNo, int columnNo) {
        cell = getRow(rowNo).createCell(columnNo);
    }

    public static Cell getCell(int rowNo, int columnNo){
        cell = sheet.getRow(rowNo).getCell(columnNo);
        return cell;
    }

    public static void inputToCell(int rowNo, int columnNo, String value){
        getCell(rowNo, columnNo).setCellValue(value);
    }

    public static void writeToFile(String pathToFile) throws Exception {
        fos = new FileOutputStream(pathToFile);
        wb.write(fos);
        wb.close();
        fos.close();
    }
}
