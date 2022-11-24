package readfiles;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readmefile {
    @Test
    public void Test() throws IOException {
        String path="C:\\Users\\mario\\Desktop\\CLARITER\\ACI\\Test Tariffario Umbria.xlsm";
        File file= new File(path);
        FileInputStream Stream= new FileInputStream(file);
        XSSFWorkbook WB= new XSSFWorkbook(Stream);
        XSSFSheet Sheet= WB.getSheet("Test Case");
        int rowcount=Sheet.getLastRowNum()- Sheet.getFirstRowNum();
        System.out.println(rowcount);
    }
}
