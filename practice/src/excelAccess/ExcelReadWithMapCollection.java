package excelAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWithMapCollection {

	public static void readExcel() throws IOException {

		FileInputStream fis = new FileInputStream(new File("C:\\Users\\raverma\\Desktop\\testSheet.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int totalRow = sheet.getPhysicalNumberOfRows();
		System.out.println("total number of rows in sheet is" + " " + totalRow);

		// insert sheet data in map
		TreeMap<String, String> treemap = new TreeMap<>();
		for (int i = 0; i < totalRow; i++) {
			treemap.put(sheet.getRow(i).getCell(0).getStringCellValue(),
					sheet.getRow(i).getCell(1).getStringCellValue());

			//System.out.println(sheet.getRow(i).getCell(1).getAddress());

		}
		for (Map.Entry<String, String> set : treemap.entrySet()) {
			if (set.getKey().equals("cc")) {
				System.out.println(set.getKey() + " " + set.getValue());
			}
		}

	}

	public static void main(String[] args) throws IOException {
		readExcel();
	}

}
