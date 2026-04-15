package hw3;

import java.util.Scanner;

public class Hw3_3Adv {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
//		但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,
//		讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
	

		int hatenum = 0,i = 0,p =0;
		int arr [] = new int[49];

		System.out.print("阿文請輸入你討厭的數字1 ~ 9：");
		Scanner sc = new Scanner(System.in);		
		if(sc.hasNextInt()) {
			hatenum = sc.nextInt();
		}
		
		for(int n = 0; n <= 4; n++) {
			if(n != hatenum) {
				for(int m = 0; m <= 9; m++) {
					if(m != hatenum && n + m > 0) {
						
						arr[i] = n * 10 + m;
						System.out.print(arr[i] + " ");
						i++;
						if(i % 5 == 0) {
							System.out.println("\t");
						}
					}				
				}			
			}
		}
		System.out.println();
		System.out.print("總共有 " + i + "可選");
		System.out.println();	
		while(p < 6) {
			int r = (int) (Math.random() * i);
			if(arr[r] != 0) {
				System.out.print(arr[r] + " ");	
				arr[r] = 0;
				p++;
			}
		}
	}
}
