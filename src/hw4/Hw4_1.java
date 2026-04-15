package hw4;

public class Hw4_1 {
	
	public static void main (String[] args) {
		
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int i[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int avg = 0, sum = 0;
		
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		avg = sum/i.length;
		System.out.print(avg);
		System.out.println();
		
		for(int j = 0; j < i.length; j++) {
			if(i[j] > avg) {
				System.out.print(i[j] + " ");
			}
		}	
	}
	

}
