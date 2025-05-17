package OnlineTeachingSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginSystem6_3 {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("请分别输入用户名和密码");
		String user = sc.next();
		String password = sc.next();
		sc.close();
		
		BufferedReader br = new BufferedReader(new FileReader("src/lyingFileRead.txt"));
		String line = null;
		boolean state = false;
		while((line = br.readLine()) != null) {
			String[] info = line.split("，");
			String fileUser = info[0];
			String filePassword = info[1];
			if(user.equals(fileUser) && password.equals(filePassword)) {
				System.out.println("欢迎登陆");
				state = true;  //找到了
				break;
			}
		}
		if(state == false) {  //妹找到
			System.out.println("用户名或密码错误");
		}
		br.close();
	}
}
