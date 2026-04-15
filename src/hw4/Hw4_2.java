package hw4;

public class Hw4_2 {
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
	
	public static String reverse(String s1){
		int len = s1.length();
		char [] new_arr = new char[len];
		for(int i = 0; i < len; i++) {
			new_arr[i] = s1.charAt(len - 1 -i);
		}
		return new String(new_arr);
	}
	
	public static void main(String[] args) {
		String s1 = "Hello world";
		String result = reverse(s1);
		System.out.print(result);
	}

}
