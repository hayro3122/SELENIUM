package com.cybertek;

public class WorkingWithExcel {

	public static void main(String[] args) {
		String path = "C:\\Users\\hayro\\Desktop\\testData.xlsx";
		Xls_Reader data = new Xls_Reader(path);
		int rcount = data.getRowCount("data1");
		System.out.println(rcount);
	 
		String cdata = data.getCellData("data1", "name", 2);
		 System.out.println(cdata);
		 
		 int ccount= data.getColumnCount("data1");
		 System.out.println(ccount);

		 data.setCellData("data1", "name", 7, "Mehmet");
	} 

}
