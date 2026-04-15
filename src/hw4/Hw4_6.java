package hw4;

public class Hw4_6 {
//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int[][] grades= {{10, 35, 40, 100, 90, 85, 75, 70},
						{37, 75, 77, 89, 64, 75, 70, 95},
						{100, 70, 79, 90, 75, 70, 79, 90},
						{77, 95, 70, 89, 60, 75 ,85 ,89},
						{98, 70, 89, 90, 75, 90, 89, 90},
						{90, 80, 100, 75, 50, 20, 99, 75}};

		int[] times = {0,0,0,0,0,0,0,0};
		for(int i = 0; i < grades.length; i++) {
			int max = grades[0][0];
			for(int j = 0; j < grades[i].length; j++) {
				if(grades[i][j] > max) {
					max = grades[i][j];
				}
			}
			for(int j = 0; j < grades[i].length; j++) {
				if(grades[i][j] == max) {
					times[j]++;
				}
		}
			
		}
		System.out.println("每位同學考最高分次數");
		System.out.println("1號 2號 3號 4號 5號 6號 7號 8號 ");

		for(int i = 0; i < 8; i++) {
			System.out.print(times[i] + "   ");
		}
		
		}
}
