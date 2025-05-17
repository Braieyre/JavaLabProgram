package HiddenWord5_10;

public class Application {
	public static void main(String args[]) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		String hint = null;
		hint = puzzle.getHint("AAAAA");
		System.out.println(hint);
		hint = puzzle.getHint("HELLO");
		System.out.println(hint);
		hint = puzzle.getHint("HEART");
		System.out.println(hint);
		hint = puzzle.getHint("HARMS");
		System.out.println(hint);
		hint = puzzle.getHint("HARPS");
		System.out.println(hint);
		
	}
}
