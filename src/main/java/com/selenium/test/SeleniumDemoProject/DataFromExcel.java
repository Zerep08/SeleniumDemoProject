package com.selenium.test.SeleniumDemoProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcel {
	
	
	public static void main(String[] args) throws IOException {
		//Search the document in the computer
		FileInputStream fis = new FileInputStream("C:\\Users\\1459751\\Downloads\\data.xlsx");
		
		//Create the object for the book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Create an Object for the sheet
		XSSFSheet sheet = wb.getSheet("script");
		
		//Create an object for the row
		XSSFRow row = sheet.getRow(0);
		
		//Create an object fir the cell
		XSSFCell cell = row.getCell(0);
		
		// Retrieve the value  //To add value to the document use setStringCellValue()
		System.out.println(cell.getStringCellValue());
		
	}

}
