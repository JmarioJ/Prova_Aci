import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_Umbria {
    public static void main(String[] args) throws IOException {
        //lettura del file
        File src=new File("src/main/java/readfiles/Test Tariffario Umbria.xlsm");


        //mi fa accedere al file
        FileInputStream fis=new FileInputStream(src);

        //
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet= wb.getSheetAt(0);

        //il numero delle righe
        int getRowCount=sheet.getLastRowNum();

        // è un for loop e finisce solo quando legge l'ultimo numero
        for (int i = 0; i < getRowCount; i++) {

            //improving nested loop
            // for (int j = 0; j <i; j++) {

            //creamo una nuova variabile
            String data1=sheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println( data1);


           // }

        }
    }
}
