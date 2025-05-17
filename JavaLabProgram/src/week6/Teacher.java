package week6;

public class Teacher implements Visitor{
	
	int standardAnswers[] = {18, 16, 28, 3};
	int[] answerCards;
	public void visit(TestPaper paper) {
		int totalScore = 0;
		answerCards = paper.backAnswers();
		for(int i = 0; i<standardAnswers.length; i++) {
			if(answerCards[i] == standardAnswers[i]) {
				totalScore ++;
			}
		}
		System.out.println(paper.getName() + "考试的分数是：" + totalScore);
		
	}
}
