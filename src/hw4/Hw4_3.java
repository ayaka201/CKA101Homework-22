package hw4;

public class Hw4_3 {
	
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	
	public static void main(String[] args) {
		String s1[]= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		count(s1);
	}
	public static void count(String s[]) {
		int sum = 0;
		
		for(int i = 0; i < s.length; i++) {

			for(int j = 0; j < s[i].length(); j++) {
				switch(s[i].charAt(j)) {
				case 'a':
				sum++;
				break;
				case 'e':
				sum++;
				break;
				case 'i':
				sum++;
				break;
				case 'o':
				sum++;
				break;
				case 'u':
				sum++;
				break;
				}

			}

		}
		System.out.print("陣列當中共有" + sum +"個母音");
	}
}

