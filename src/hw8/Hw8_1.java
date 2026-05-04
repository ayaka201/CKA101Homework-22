package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hw8_1 {
//	請建立一個Collection物件並將以下資料加入:
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
	
	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(new Integer(100));
		a.add(new Double(3.14));
		a.add(new Long(21L));
		a.add(new Short("100"));
		a.add(new Double(5.1));
		a.add("Kitty");
		a.add(new Integer(100));
		Object myobj = new Object();
		a.add(myobj);
		a.add("Snoopy");
		a.add(new BigInteger("1000"));


//	印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		
		//Iterator
//		Iterator objs = a.iterator();
//		while(objs.hasNext()) {
//			System.out.println(objs.next());
//		}
		
		//for
//		for(int i = 0; i < a.size(); i++) {
//			Object objs = ((ArrayList) a).get(i);
//			System.out.println(objs);
//		}
		
		//foreach
		for(Object objs : a) {
			System.out.println(objs);
		}
		
		
//		移除不是java.lang.Number相關的物件
//		a.remove(myobj);
//		a.remove("Kitty");
//		a.remove("Snoopy");

		System.out.println("===================================");
		//removeIf
//		a.removeIf(item ->!(item instanceof Number));
		

		//iterator搭配instanceof
		Iterator objs = a.iterator();
		while(objs.hasNext()) {
			Object b = objs.next();
			if(b instanceof Number) {
				System.out.println(b);
			}
		}
	

//		再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
//		for(Object objs : a) {
//			System.out.println(objs);
//		}
//		
	
		
		
	}
}
