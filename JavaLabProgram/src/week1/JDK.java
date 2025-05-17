package week1;
import java.util.Scanner;

public class JDK {
	String s;
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		sc.close();
	}
	public void outputJRE() {
		System.out.printf("JDK 是 Java 语言的软件开发工其包，\n"
				+ "主要用于移动设备、嵌入式设备上的 java 应用程序\n"
				+ "JDK 是整个 java 开发的核心，\n"
				+ "它包含了 JAVA 的运行环境(JyMtJaxa系统类库)和 JAVA 工具。");
	}
}