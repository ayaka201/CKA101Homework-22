package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,
//		猜對則顯示正確訊息,如圖示結果:
		
		int guessnum = 0;
		Scanner sc1 = new Scanner(System.in);
		

		System.out.println("開始猜數字吧！");			
		int randomnum = (int) Math.random() * 10;
		
		
		for(int i = 0; i <= 10; i++) {
			if(sc1.hasNextInt()) {
				guessnum = sc1.nextInt();
			}
			if(guessnum == randomnum) {
				System.out.println("猜對了！");	
				i = 11;
			}
			else {
				System.out.println("猜錯了！");					
			}
		}				
	}		
}

