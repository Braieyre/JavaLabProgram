package week3;

import java.util.Scanner;
public class Scores3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, score;
		System.out.println("请输入用户id：");
		id = sc.nextInt();
		Scores theScore = new Scores();
		theScore.getID(id);
		score = theScore.outPutScores();
		System.out.println("用户" + id + "的积分： " + score );
		sc.close();

	}

}
