package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw7_3 {
	
	public static void main(String[] args) throws IOException{
		Hw7_3 copy = new Hw7_3(); 
//		• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,
//		第一個參數所代表的檔案會複製到第二個參數代表的檔案		
		copy.copyFile("C:\\CKA101__Workspace\\CKA101Homework-22\\src\\hw7\\A.txt","C:\\CKA101__Workspace\\CKA101Homework-22\\src\\hw7\\B.txt");
		System.out.print("複製完成");
	

		

	}
	
	

		public void copyFile(String src, String dest) throws IOException {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int len;
			while((len = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, len);
				
			}
			
			
			fos.close();
			fis.close();
			
		}
	

}
