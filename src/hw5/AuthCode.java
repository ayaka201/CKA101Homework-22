package hw5;

import java.util.Random;

public class AuthCode {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,
//	請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,
//	此驗證碼內容包含了英文大小寫與數字的亂數組合,如圖:
	private int[] r = new int[62];
	
	
	public AuthCode() {
		int a = 48;
		for(int i = 0; i < 10; i++) {
			r[i] = a;
			a++;
		}

		int b = 65;
		for(int i = 10; i < 36; i++) {
			r[i] = b;
			b++;
		}
		int c = 97;
		for(int i = 36;i < 62; i++) {
			r[i] = c;
			c++;
		}
		
	}
	
	
	public int[] genAuthCode() {
		int[] result = new int[8];
		Random num = new Random();
		for(int i = 0; i < result.length; i++) {
			result[i] = r[num.nextInt(62)];
		}
			return result;
	}
	
	
	public static void main(String[] args) {
		AuthCode a = new AuthCode();
		int[] s = a.genAuthCode();

		for(int i = 0; i < s.length; i++) {
			System.out.print((char)s[i]);
		}	
	}
	
	
}
