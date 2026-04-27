package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw7_4 {
	public static void main(String[] args) {

//		• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//		注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

//		• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何
//		(請利用多型簡化本題的程式設計)

		// 建立檔案路徑
		File file = new File("C:\\data\\Object.ser");
		// 建立資料夾路徑
		File dir = new File("C:\\data");
		// 若無資料夾新建一個
		if (!dir.exists()) {
			dir.mkdir();
		}

		try {
			// 輸出
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// 建立物件
//			Dog d1 = new Dog("big doggggg");
//			Cat c1 = new Cat("big cattttt");
//			Dog d2 = new Dog("dog dog");
//			Cat c2 = new Cat("cat cat");
			
			Animal[] animals = {
					new Dog("BIG D"),
					new Cat("BIG C"),
					new Dog("puppy"),
					new Cat("kitty"),
			};
			// 寫入物件序列化
//			oos.writeObject(d1);
//			oos.writeObject(c2);
//			oos.writeObject(d2);
//			oos.writeObject(c1);
			
			for(int i = 0; i < animals.length; i++) {
				oos.writeObject(animals[i]);
			}

			oos.close();
			fos.close();

			// 輸入
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// 讀取
//			for (int i = 0; i < 4; i++) {
			while (true) {
				Animal a = (Animal) ois.readObject();
				a.speak();
			}

		} catch (EOFException e) {
			// 正常結束（讀完了）
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
