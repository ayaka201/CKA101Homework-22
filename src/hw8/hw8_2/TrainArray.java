package hw8.hw8_2;

import java.util.*;

public class TrainArray {
	public static void main(String[] args) {
		Train t[] = new Train[7];
		
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122 , "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		t[3] = t4;
		t[4] = t5;
		t[5] = t6;
		t[6] = t7;
		
		Arrays.sort(t);
		
		//foreach
		for(Train aTrain: t) {
			System.out.println( aTrain.getNumber() + " - " + aTrain.getDest() + " - " + aTrain.getPrice() + " - " + aTrain.getStart() + " - " + aTrain.getType());
		}
		
	}

}
