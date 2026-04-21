package hw5;

public class Hw5_2 {
//	請設計一個方法為randAvg(),
//	從10個 0~100(含100)的整數亂數中取平均值
//	並印出這10個亂數與平均值,如圖:
	public static void main(String[] args) {
		int randomnum[] = new int[10];
		double sum = 0;

		System.out.println("列出隨機10個亂數：");
		for(int i = 0; i < randomnum.length; i++) {
			randomnum[i] = (int)(Math.random() * 101);
		}

		randAvg(randomnum,sum);
	}
	static void randAvg(int[] num,double sum) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}

		System.out.println();

		System.out.println("10個亂數的平均 = " + sum / num.length);
		
	}

}
