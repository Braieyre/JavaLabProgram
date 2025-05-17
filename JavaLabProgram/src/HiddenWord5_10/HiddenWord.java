package HiddenWord5_10;

public class HiddenWord {
	String hid;
	public HiddenWord(String hid) {
		this.hid = hid;
	}
	
	public String getHint(String word) 
	{
		char[] std = hid.toCharArray();				//化为字符型数组，便于逐一比较
		char[] guess = word.toCharArray();
		char[] hint = new char[hid.length()];
		for(int i = 0; i < hid.length(); i++) 
		{
			
				if(std[i] == guess[i]) 
				{
					hint[i] = std[i];
				}
				else 
				{
					for(int j = 0 ; j < hid.length(); j++)    //从0开始遍历，因为重复者可靠前
						{
							if(guess[i] == std[j]) 
							{
								hint[i] = '+';
								break;			//有一个就给我停住，否则后续会覆盖
							}else 
							{
								hint[i] = '*';
							}
						}
				}
		}
		
		String hin = new String(hint);			//创建了一个String的对象，可以用for循环string自增来代替
		return hin;
	}
}
