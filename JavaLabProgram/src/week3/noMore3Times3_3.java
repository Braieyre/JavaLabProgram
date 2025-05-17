package week3;
import java.util.Scanner;

public class noMore3Times3_3 {

	public static void main(String[] args) {
		System.out.println("请输入用户名（回车）和密码");
		String name;
		boolean right = false;
		int psw, count = 0;
		Scanner sc = new Scanner(System.in);
		while(count < 3) {
		    name = sc.nextLine();
		    psw = sc.nextInt();
		    sc.nextLine();
		    VertifyBy3 vertify = new VertifyBy3();
		    vertify.getInfo(name, psw);
	        right = vertify.vertify3();
	        if(right)
	        {
	    	    break;
	        }
	        else
	        {
	    	    count++;
	    	    System.out.println("请重新输入");
	        }		
		}
		if(count == 3) {
		System.out.println("输入错误 3 次，退出系统");
		}
		sc.close();
		}

}
