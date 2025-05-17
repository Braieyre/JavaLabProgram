package week6;

public abstract class TestPaper {
	public abstract String[] backQuestion();
	public abstract int[] backAnswers();
	public abstract void accept(Visitor v);
	
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
}
