package week6;

import java.util.Scanner;

public class Student implements Visitor{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public Student(){
		name = "Anonymous";
	}
	
	public void visit(TestPaper paper) {
		String[] questions = paper.backQuestion();
		int[] answers = paper.backAnswers();
		paper.setName(name);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			answers[i] = sc.nextInt();			
		}
		sc.close();
		
	}
	
}
