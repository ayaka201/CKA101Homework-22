package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
	
	public static void main(String[] args) throws IOException {
		String str;
		int totalbyte = 0;
		int totalchar = 0;
		int totalline = 0;
		FileReader fr = new FileReader("C:\\CKA101__Workspace\\CKA101Homework-22\\src\\hw7\\Sample.txt");
		
		
		File file = new File("C:\\CKA101__Workspace\\CKA101Homework-22\\src\\hw7\\Sample.txt");
		totalbyte = (int) file.length(); //file檔案位元組
		
		BufferedReader br = new BufferedReader(fr);
		while((str = br.readLine()) != null) { //讀取一整行，直到看到換行符號
			totalline += 1; 
			totalchar += str.length(); //計算str的長度(多少字元)
			
		}
		System.out.println("Sample.txt檔案共有 " + totalbyte + " 個位元組， " + totalchar + " 個字元， " + totalline + " 列資料");
	
		
		
		br.close();
		fr.close();
		
	}

}
