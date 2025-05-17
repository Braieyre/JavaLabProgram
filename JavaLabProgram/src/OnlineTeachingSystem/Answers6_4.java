package OnlineTeachingSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Answers6_4 {
	public static void main(String args[]) throws IOException {
		System.out.println("欢迎进入考试系统，输入Go，开始考试");
		Scanner sc = new Scanner(System.in);
		String start = sc.next();
		
		if(start.equals("Go")) 
		{
			//进入考试系统
			String stdAnswer = "";   //备好标准答案
			BufferedReader br = new BufferedReader(new FileReader("src/questions.txt"));
			String line = "";
			while((line = br.readLine())!= null) 
			{
				if((line.contains("-----")) == true)
				{
					stdAnswer += line.replace("-", "");
					continue;
				}
				System.out.println(line);
			}
			br.close();
//			System.out.println(stdAnswer);		Test, Since OutOfBoundOfArrays
			int scores = 0;
			char[] stdAns = stdAnswer.toCharArray();
			String answer = sc.next();
			char[] ans = answer.toCharArray();
			if(ans.length > stdAns.length) {
				System.out.print("输入答案输多了，也洗洗睡吧！");
				return;
			}
			
			for(int i = 0; i < stdAnswer.length() ; i++) 
			{
				if(stdAns[i] == ans[i])
				{
					System.out.print(i+1 + "、" + "正确  ");
					scores += 2;
				}
				else
				{
					System.out.print(i+1 + "、" + "错误  ");
				}
			}
			System.out.print("总分：" + scores + "分");
		}else {
			System.out.print("不想考试就回家洗洗睡吧！");
		}
	}
}
