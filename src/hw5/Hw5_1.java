package hw5;

import java.util.Scanner;

public class Hw5_1 {
//	請設計一個方法為starSquare(int width, int height),
//	當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
	public static void main(String[] args) {
		int arr[] = new int[2];
		System.out.println("請輸入寬與高：");
		Scanner  wh = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			arr[i] = wh.nextInt();
		}
		starSquare(arr[0],arr[1]);
	}
	public static void starSquare(int w, int h) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}
