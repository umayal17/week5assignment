package week5.day2.assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelW3 {
	public static String[][] readData(String createLead) throws IOException
	{
		
		//setup the path of new workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data./W3school.xlsx");
		
		//set up the worksheet
		XSSFSheet ws=wb.getSheetAt(0);
		
		//get the rowcount excluding header
		int rowcount =ws.getLastRowNum();
		
		//get cellcount
		int cellcount=ws.getRow(rowcount).getLastCellNum();
		System.out.println("The total number of rows : "+rowcount);
		System.out.println("The total number of columns : "+cellcount);

		String [][] data=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				//reading data from cell
				String value=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
			
			}
		}
		wb.close();
		return data;
}
}
