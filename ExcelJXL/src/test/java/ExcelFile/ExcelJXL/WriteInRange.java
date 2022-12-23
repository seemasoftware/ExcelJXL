package ExcelFile.ExcelJXL;

import java.io.File;
import java.io.IOException;
import java.net.StandardSocketOptions;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteInRange {
public void WriteInaange(int raw, int coloumn) throws IOException, WriteException {
	File f = new File("../ExcelJXL/TestSeema.xls");
	WritableWorkbook wk =  Workbook.createWorkbook(f);
	WritableSheet ws = wk.createSheet("seema", 0);
	Scanner s = new Scanner(System.in);
	String data;
	System.out.println("Please enter data :");
	for (int i=0;i<4;i=i+1)  // for row
	{								
		for(int j=0;i<4;j=j+1)// for column
			{     
			data = s.nextLine();
			Label l = new Label(j,i,"seem"); // for content
			}
	}
	wk.write();
	wk.close();
}
public static void main(String[] args) throws WriteException, IOException {
	WriteInRange w = new WriteInRange();
	w.WriteInaange(2, 5);;
}
}
