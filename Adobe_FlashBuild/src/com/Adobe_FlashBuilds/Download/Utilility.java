package com.Adobe_FlashBuilds.Download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author rajeshverma
 * @method readExcel(String):string[][]
 */
public class Utilility {

	/**
	 * readExcel method traverse whole excel sheet and return excel data in array.
	 * 
	 * @param ExcelPath
	 * @return
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public static String[][] readExcel(String ExcelPath) throws InvalidFormatException, IOException {
		/**
		 * make object of File class with proper file location
		 */
		FileInputStream myExcel = new FileInputStream(ExcelPath);
		/**
		 * traverse the whole excel sheet and store data in excel[][];
		 */

		XSSFWorkbook wb = new XSSFWorkbook(myExcel);
		XSSFSheet sheet = wb.getSheetAt(0);
		String[][] excel = new String[sheet.getLastRowNum() + 1][5];
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 5; j++) {
				XSSFCell cell = row.getCell(j);
				// excel[i][j]= cell.getStringCellValue();
				if (!(cell.getStringCellValue() == null)) {
					// System.out.println(cell.getStringCellValue());
					excel[i][j] = cell.getStringCellValue();
				} else {
					break;
				}
			}
		}
		wb.close();
		return excel;
	}

	public static String findDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		LocalDate localDate = LocalDate.now();
		return dtf.format(localDate);
	}

	public static String createFolder(String FolderLocation) {
		new File(FolderLocation).mkdir();
		return FolderLocation;
	}

}
