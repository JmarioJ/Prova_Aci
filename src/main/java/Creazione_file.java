import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class Creazione_file {
    public static void main(String[] args) throws IOException {
       //Creazione foglio Excel
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Prova_M");

        //Creare righe e inserimento valori nella colonna
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Mario");

        //Creare il file nella mia cartella
        File Ffile= new File("C:\\Users\\mario\\Desktop\\CLARITER\\ACI\\Prova_M2.xlsx");

        workbook.write(Ffile);
        workbook.close();


    }
}
