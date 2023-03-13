package day09_excel_screenshot_jsExecutor;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        //1-bilgisayardaki excele ulasabilmek icin dosyaYolu gerekir

        String dosyaYolu = "src/test/java/day09_excel_screenshot_jsExecutor/ulkeler.xlsx";
        //2- dosya  yolunu olusturdugumuz excelden bilgileri alabilmek icin FileInputStream objesi olusturmaliyiz

        FileInputStream fis = new FileInputStream(dosyaYolu);

        //3-bilgileri aldigimiz excelde calisma yapabilmek icin kopya bir wordbook yapmaliyiz

            Workbook workbook=WorkbookFactory.create(fis);

            //Bilgisayarimixin icindeki butun bilgiler artik workbook objesine kayitli
        //excelin yapisi geregi
        // once sayfa,
        // sonra satir,
        // sonra istenen hucre
        // olusturulmalidi veya okunmalidir

        Sheet sayfa1=workbook.getSheet("Sayfa1");
        Row row=sayfa1.getRow(11);
        Cell cell= row.getCell(2);

        System.out.println(cell);
        String expectedData="Azerbaycan";
        String actualData=cell.toString();







        }
    }



