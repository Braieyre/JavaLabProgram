package week6;

public class ArithmeticPaper extends TestPaper {
	String[] questions;
	int[] answerCards;
	
	public ArithmeticPaper() {
		questions = new String[4];
			questions[0] = "6+12 等于几？";
			questions[1] = "6+2×5 等于几？";
			questions[2] = "30-10÷5 等于几？";
			questions[3] = "28%5 等于几？";
		answerCards = new int[4];
	}
	
	public String[] backQuestion() {
		return questions;
	}
	public int[] backAnswers() {
		return answerCards;
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
