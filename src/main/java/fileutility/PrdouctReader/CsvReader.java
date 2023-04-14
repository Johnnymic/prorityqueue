package fileutility.PrdouctReader;

import model.Product;
import model.Stores;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    Stores store;
    Product product;
    final String filePath = "src/main/java/fileutility/Book 1.xlsx";

    public CsvReader() {
    }


    public List<Product> readProductFromExcelFile() {

        List<Product> products = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);) {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet firstSheet = workbook.getSheetAt(0);

            int rowNumber = firstSheet.getLastRowNum();


            for (int row = 1; row <= rowNumber; row++) {
                String name = firstSheet.getRow(row).getCell(0).getStringCellValue();

                double price = firstSheet.getRow(row).getCell(1).getNumericCellValue();
                int quantity = (int) firstSheet.getRow(row).getCell(2).getNumericCellValue();
                String category = firstSheet.getRow(row).getCell(3).getStringCellValue();
                products.add(new Product(name, price, quantity, category));



            }

        } catch (IOException i) {
            i.printStackTrace();
        }
        return products;
    }

}

