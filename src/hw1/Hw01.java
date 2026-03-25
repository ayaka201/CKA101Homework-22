package hw1;


public class Hw01 {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		
		System.out.println("12+6=" + (a + b));
		System.out.println("12*6=" + (a * b));

		System.out.println();		
		//======================================
		//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		
		System.out.println("200顆雞蛋是" + (egg/12) + "打又" + (egg % 12) + "顆");

		System.out.println();		
		//======================================
		//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒		
		int sec = 2566559;
		int min = sec / 60;
		int hr = min / 60;
		int day = hr /24;		
		
		System.out.println((day) + "天" + (day % 24) + "小時" + (hr % 60) + "分" + (min % 60) + "秒");

		System.out.println();		
		//======================================
		//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.14159;
		int radius = 5;
		
		System.out.println("圓面積=" + (radius * radius * PI) + "圓周長=" + (radius * 2 * PI));

		System.out.println();		
		//======================================
		//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,
		//本金加利息共有多少錢 (用複利計算,公式請自行google)FV期末本利和 ＝ PV期初本金×（1 ＋ R利率）n 次方
		double pv = 1_500_000, r = 0.02;
		
		System.out.println("本金加利息 = " + pv * Math.pow(1 + r, 10));

		System.out.println();
		//======================================
		//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); //5 + 5 所以計算出 10 
		
		System.out.println(5 + '5'); //'5'unicode數值為53 + 5 = 58
		
		System.out.println(5 + "5"); //5 連接字串 5 得 55
	}		
	

}
