package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
		
		while(true) {
			try {				
				System.out.println("請輸入 x：");
				int inputx = xy.nextInt();
				System.out.println("請輸入 y：");
				int inputy = xy.nextInt();
				Calculator c1 = new Calculator(inputx,inputy);
				
				System.out.println(inputx + "的" + inputy + "次方等於" + c1.powerXY(inputx, inputy));
				break;
			}
			catch (CalException e){
				System.out.println(e.getMessage());
				System.out.println();
			}
			catch(InputMismatchException e) {
				System.out.println("輸入格式錯誤ㄌ");
				System.out.println();
				xy.next(); //清除內部資料，避免進入死迴圈
			}
		}
	}
}
