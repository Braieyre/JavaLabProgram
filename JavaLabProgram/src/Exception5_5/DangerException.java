package Exception5_5;

public class DangerException extends Exception{
	String message;
	DangerException(){
		message = "危险品！";
	}
	
	public void toShow(){
		System.out.println(message);
	}
}
