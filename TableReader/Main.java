package xDomaci22;

import org.apache.poi.ss.formula.ptg.TblPtg;
import org.apache.poi.ss.usermodel.Table;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        TableReader.tableReader("primer1.xlsx",0);

        TableReader.createRow(3);
        TableReader.createCell(3,0);
        TableReader.createCell(3,1);
        TableReader.inputToCell(3, 0, "Zikic");
        TableReader.inputToCell(3, 1, "Pera");

        FileOutputStream os = new FileOutputStream("primer1.xlsx");
        TableReader.wb.write(os);
        TableReader.wb.close();
        os.close();
    }
}
