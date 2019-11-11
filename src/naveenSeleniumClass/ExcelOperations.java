package naveenSeleniumClass;

import utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\lgeil\\Desktop\\facebookuser.xlsx");
		
		int columnCount = reader.getColumnCount("UserInfo");
		System.out.println("total column present in excel: " +columnCount);
		//reader.addSheet("HomeLoginInfo");
		System.out.println(reader.getCellRowNum("UserInfo", "Firstname", "Vivek"));
		
		if(!reader.isSheetExist("HomeLoginInfo"))
			reader.addSheet("HomeLoginInfo");
	}
	
	  

}
