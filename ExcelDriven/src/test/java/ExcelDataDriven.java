import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static ArrayList<String> getData(String sheetname,String testname) throws InvalidFormatException, IOException {
		ArrayList<String> a=new ArrayList<String>();

		File f=new File("C:\\Users\\Malempati Parvathi\\Desktop\\practice\\TestData\\DemoTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f);

		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetname)) {
				XSSFSheet sheet=workbook.getSheetAt(i);

				Iterator<Row> rows=sheet.iterator();
				Row firstRow=rows.next();

				Iterator<Cell> ce=firstRow.cellIterator();
				int column=0;
				int k=0;

				while(ce.hasNext()) {
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						column=k;
					}
					k++;
				}
				System.out.println("Coloumn is :"+column);

				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testname)) {

						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext()) {
							System.out.println(cv.next().getStringCellValue());
							
							Cell c= cv.next();
							
							if(c.getCellType()==CellType.STRING)
							{

								a.add(c.getStringCellValue());
							}
							else{

								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}
						}
					}
					
				}


			}
		}
		return a;
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		ArrayList data=getData("Sheet1","AddProfile");
		
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
			
			
			
			
		}
		


	}

}
