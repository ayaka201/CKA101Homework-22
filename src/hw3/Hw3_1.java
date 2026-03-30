package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[3];
		
		System.out.println("請輸入三個數字eg:1 2 3");
		
		for(int i = 0; i < arr.length; i++) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

		Arrays.sort(arr); 
		for(int i = 0; i < arr.length; i++) {			
				System.out.print(arr[i]+" ");					
		}
		
		int a = arr[0], b = arr[1], c = arr[2];	
		
		System.out.println();	

		if(a == 0 || b == 0 || c ==0 || c >= a + b) {		
			System.out.print("不是三角形");	
		}
		else if(a == b && b == c) {		
			System.out.print("正三角形");			
		}
		else if(b == c) {		
			System.out.print("等腰三角形");			
		}
		else if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {	
			System.out.print("直角三角形");			
		}
		else {	
			System.out.print("其他三角形");				
		}
		
	}
	
}
	
