package hw8.hw8_2;

import java.util.*;

public class TrainArrayList {
	public static void main(String[] args) {
		List<Train> list = new ArrayList<Train>();

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122 , "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Collections.sort(list);
		
		//foreach
		for(Train aTrain: list) {
			System.out.println( aTrain.getNumber() + " - " + aTrain.getDest() + " - " + aTrain.getPrice() + " - " + aTrain.getStart() + " - " + aTrain.getType());
		}

		System.out.println("================== ˊ ˇ ˋ =================");
		
		//Iterator
		Iterator<Train> objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}

		System.out.println("================== ˊ ˇ ˋ =================");
		
		//for
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
			
		}

		
		
	}

}
