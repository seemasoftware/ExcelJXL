package ExcelFile.ExcelJXL;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Assign {
	public void writeInaRange(int row,int column) throws IOException, WriteException
	{
	File f=new File("../ExcelJXL/Test.xls");
	WritableWorkbook wk=Workbook.createWorkbook(f);
	WritableSheet ws=wk.createSheet("SheetName",0);
	Scanner s=new Scanner(System.in);
	String data=null;
	System.err.println("Please enter the data");
	for(int i=0;i<row;i=i+1)
	{
	 for(int j=0;j<column;j=j+1)
	 {
	data=s.nextLine();
	  Label L=new Label(j,i,data);
	}
	}
	wk.write();
	wk.close();
	}


public static void main(String[] args) throws WriteException, IOException {
	Assign w = new Assign();
	w.writeInaRange(1,2);
}

}
