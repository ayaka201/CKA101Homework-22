package hw4;

import java.util.Scanner;

public class Hw4_5 {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[3];
		int day = 0;
		System.out.print("請輸入年月日：yyyy mm dd");
		System.out.println("");
		for(int i = 0; i < 3; i++) {
			if(s.hasNextInt()) {
				arr[i] = s.nextInt();
			}
		}
		if(arr[0] % 4 != 0 && arr[0] % 100 == 0 && arr[1] == 2 && arr[2] >28) {
			System.out.print("Error!");
		}
		else if(arr[1] % 2 == 0)
		if(arr[1] < 1 || arr[1] > 12 || arr[2] < 1 || arr[2] > 30) {
			System.out.print("Error!");			
		}
		else if(arr[1] < 1 || arr[1] > 12 || arr[2] < 1 || arr[2] > 31) {
			System.out.print("Error!");			
		}
		else {
			for(int i = 1; i < arr[1]; i++) {
				if(arr[1] % 2 == 0 && arr[1] != 2) {
					day =day + 30;
				}
				else if(arr[1] == 2 && arr[0] % 4 != 0 ) {
					day = day +28;
				}
				else if(arr[1] == 2 && arr[0] % 4 == 0 && arr[0] % 100 != 0 ) {
					day = day + 29;
				}
				else if(arr[2] <= 31){
					day =day +31;
				}
			}
			day =day + arr[2];
			System.out.print(day);
		}
	}
}
