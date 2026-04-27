package hw7;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Hw7_2 {
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡
//	(請使用append功能讓每次執行結果都能被保存起來)
	
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		
		FileOutputStream fos = new FileOutputStream("C:\\CKA101__Workspace\\CKA101Homework-22\\src\\hw7\\Data.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1001 - 1);
			ps.println(arr[i]);
		}
		
		ps.close();
		bos.close();
		fos.close();	
		
	}	

}
