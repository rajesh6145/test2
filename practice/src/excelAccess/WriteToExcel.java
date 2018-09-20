package excelAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.xml.internal.ws.wsdl.ActionBasedOperationSignature;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		/*File file = new File("C:\\Users\\raverma\\Desktop\\myExcel2.xlsx");
		file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		for(int i=1; i<=10;i++) {
			sheet.createRow(i).createCell(i).setCellValue(i);
		}
		
		
		
		FileOutputStream fout = new FileOutputStream(file);
		
		wb.write(fout);
		wb.close();
		*/
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\raverma\\Desktop\\myExcel2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("firstSheet");
		sheet.createRow(0).createCell(0).setCellValue("first");
		
		wb.write(fout);
		wb.close();
		
		

	}

}
