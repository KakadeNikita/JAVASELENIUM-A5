package org.generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public static String readDataFromProperties(String key)
	{
		File f=new File("./testData/config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
		
	}
	public static String readDataFromExcel(String sheetName,int rowIndex,int cellIndex)
	{
		File f=new File("./testData/DWS.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			 wb=WorkbookFactory.create(fis);
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		String data=wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return data;
	}

}
