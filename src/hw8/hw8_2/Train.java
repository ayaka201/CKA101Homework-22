package hw8.hw8_2;

import java.util.*;

public class Train implements Comparable<Train>{
	
//	請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	

//	• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//	需使用的集合裡
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}

	public void setStart(String start) {
		this.start = start;
	}
	public String getStart() {
		return start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDest() {
		return dest;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	
//	請寫一隻程式,能印出不重複的Train物件
//
//	• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//	• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//	• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)


	
	@Override
	public String toString() {
		return  number + ", " + type + ", " + start + ", " + dest + ", " + price;
	}
	public int compareTo(Train aT) {
		if(this.number > aT.number) {
			return 1;
		}
		else if(this.number == aT.number) {
			return 0;
		}
		else {
			return -1;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
	
	
	
	
}
