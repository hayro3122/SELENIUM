package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dataprovider {
	@Ignore
	@Test(dataProvider="getData")
	public void dataprovider(String username) {
		System.out.println(username);
		
	}
	@DataProvider
	public String[] getData() {
		String[] data= new String[3];
		data[0]="Mike";
		data[1]="kite";
		data[2]="tomy";
		return data;
	}
	@Test(dataProvider="data1")
	public void logout(String username, String password, String Phone, String browser) {
		System.out.println(username + "|"+ password+ "|" +Phone+ "|"+ browser);
	}
	@DataProvider
	public Object[][] data1() {
		Object[][] data= new Object[3][4];
		
		data[0][0]="username-1";
		data[0][1]="password-1";
		data[0][2]="phhone-1";
		data[0][3]="browser-1";
		
		data[1][0]="username-2";
		data[1][1]="password-2";
		data[1][2]="phhone-2";
		data[1][3]="browser-2";
		
		data[2][0]="username-3";
		data[2][1]="password-3";
		data[2][2]="phhone-3";
		data[2][3]="browser-3";
		
		return data;
		
		
	}

}
