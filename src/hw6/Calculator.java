package hw6;

public class Calculator {
//	在Calculator.java裡有個自訂方法為powerXY(int x, int y),
//	功能是會計算x的y次方並回傳結果。
	private int x;
	private int y;
	
	public Calculator(int x, int y) throws CalException{
		setData(x,y);
	}

	public void setData(int x, int y) throws CalException{
		
		
		if(x == 0 && y ==0) {
			throw new CalException("0的0次方沒有意義！");			
		}else if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}
	}
	
	

	public int powerXY(int x, int y) throws CalException{
	return (int) Math.pow(x,y);
	}

}
