package utility;

import java.util.ArrayList;

public class TestData {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		reader = new Xls_Reader("D:\\Java Test Program\\SeleniumProject\\src\\testData\\facebookuser.xlsx");

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		for (int rowNum = 2; rowNum <= reader.getRowCount("UserInfo"); rowNum++) {

			String fName = reader.getCellData("UserInfo", "Firstname", rowNum);

			String surname = reader.getCellData("UserInfo", "surname", rowNum);

			String email = reader.getCellData("UserInfo", "Email", rowNum);

			String r_email = reader.getCellData("UserInfo", "Re-EnterEmail", rowNum);

			String pwd = reader.getCellData("UserInfo", "Password", rowNum);

			String date = reader.getCellData("UserInfo", "Date", rowNum);
			String n_date = date.substring(0, 2);

			String month = reader.getCellData("UserInfo", "Month", rowNum);

			String year = reader.getCellData("UserInfo", "year", rowNum);
			String n_year = year.substring(0, 4);

			String gender = reader.getCellData("UserInfo", "gender", rowNum);
			Object obj[] = {fName, surname, email, r_email, pwd, n_date, month, n_year, gender };
			myData.add(obj);
		}
		return myData;
	}
}
