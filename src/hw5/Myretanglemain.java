package hw5;

public class Myretanglemain {
//	請另外建立一個MyRectangleMain類別,此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件,
//	設定width, depth為10, 20,透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)
//	建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
	public static void main(String[] args) {

		MyRetangle a1 = new MyRetangle();
		MyRetangle a2 = new MyRetangle(10,20);
		a1.setWidth(10);
		a1.setDepth(20);
		a1.getArea();
		a2.getArea();
	}

}
