package week4;
import java.util.Scanner;

public class H_Algorithm5_2 {
	public static void main(String[] args) {
		System.out.println("请输入一个十进制的任意数字，范围在10e32以内即可");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();
		H_Algorithm ha = new H_Algorithm();
		ha.numSetter(num);
		String hex = ha.hexAlgorithm();
		System.out.println(hex);
	}

}
