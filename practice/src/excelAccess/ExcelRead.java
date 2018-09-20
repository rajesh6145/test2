package excelAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void read() throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\raverma\\Desktop\\BuildsPath.xlsx"));

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sjstorePathForBuilds");

		Iterator<Row> row = sheet.iterator();
		row.next();
		while (row.hasNext()) {
			System.out.println(row.next().getCell(1).getStringCellValue());
		}

	}

	public static void main(String[] args) throws IOException {
		read();

	}

}
