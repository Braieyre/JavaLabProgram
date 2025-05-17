package Cradio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CardioidDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/log.txt"));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
