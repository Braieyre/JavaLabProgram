package OnlineTeachingSystem;

import java.io.FileInputStream;
import java.io.IOException;

public class LogReader6_1 {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream("src/Cradio/CardioidDemo.java");
		
		int data;
		while ((data = fis.read()) != -1 ) {
			System.out.print((char) data);
		}
		fis.close();
	}
}
