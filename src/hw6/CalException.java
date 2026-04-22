package hw6;


public class CalException extends Exception{
//	CalTest.java執行後,使用者可以輸入x與y的值,
//	請加入例外處理機制,讓程式能解決以下狀況:
	public CalException() {};	
	public CalException(String msg) {
		super(msg);
	}
	
}
