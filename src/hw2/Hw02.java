package hw2;

public class Hw02 {
	
	public static void main(String[] args) {
//		================================================		
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int j = 0, i =0;
		for(i = 0; i <= 1000; i += 2) {			
			j += i;			
		}
		System.out.print("1~1000的偶數和 = " + j);
		System.out.println();

//		================================================
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int n = 1;
		for(int m = 2; m <= 10; m++) {
			n = m * n;			
		}
		System.out.print("1~10的連乘積 = " + n);
		System.out.println();

//		================================================		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int o = 1, p = 2;
		while(p <= 10) {
			o = p * o;	
			p++;
		}
		System.out.print("1~10的連乘積 = " + o);
		System.out.println();
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		for(int k = 1; k <= 10; k++) {
			System.out.print(k * k + " ");
		}
		System.out.println();
		
//		================================================			
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int h = 0;
		for(int q = 0; q < 4; q++) {
			for(int r = 0; r <= 9; r++) {
				if(q == 0 && r != 4 && r != 0) {
					System.out.print(r + " ");
					h++;
				}
				else if(q >= 1 && r !=4) {
					System.out.print(q *10 + r + " ");
					h++;					
				}
				
			}
		}
		System.out.print("總共" + h + "個");
		System.out.println("");
		
//		================================================			
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for(int d = 10; d >= 1; d--) {
			for(int e = 1; e <= d; e++) {
				System.out.print(e + " ");					
			}	
			System.out.println("");		
		 }
			
		
		
		
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		for(int f = 1; f <= 6; f++) {
			for(int x = 1; x <= f; x++) {
				switch(f) {
				case 1:
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;	
				case 3:
					System.out.print("C");
					break;	
				case 4:
					System.out.print("D");
					break;	
				case 5:
					System.out.print("E");	
					break;
				case 6:
					System.out.print("F");
					break;	
					
				}
			}	
			System.out.println("");
		}
	}
	
}


