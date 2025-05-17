package week4;

public class H_Algorithm {
	long num;
	String hex = "";

	public void numSetter(long num) {
		this.num = num;
	}

	public String hexAlgorithm() {
		while (num != 0 ) {
			int tempOne = (int) (num % 16);
			// 下面用来断定0~f的表达方式
			char temp = 0; // 接管tempOne >= 10以后的变量
			if (tempOne >= 10) {
				switch (tempOne % 10) {
				case 0:
					temp = 'a';
					break;
				case 1:
					temp = 'b';
					break;
				case 2:
					temp = 'c';
					break;
				case 3:
					temp = 'd';
					break;
				case 4:
					temp = 'e';
					break;
				case 5:
					temp = 'f';
					break;
				}
			}

			if (tempOne < 10) {
				hex += "" + tempOne; // 10以内的表示
			} else {
				hex += "" + temp; // a b c d e f的表示
			}
			num = num / 16;
		}
		//笑死我了，这样迭代，出来之后十六进制是逆着的，给它反过来哈哈哈哈
		String hexR = "";
		for (int i = hex.length() - 1; i >= 0; i--) { 
			//越界警告，i是长度不是对应值，>=0,不然第一位没了，小基础错误
			hexR += hex.charAt(i);  
		}
		return hexR;
	}
}




/*
 * 总结： 1、 从简单到复杂。 我是从第一个16位开始考虑的，才有了整个算法模型的基础。
 * 可是当我开始思考第二个16位的时候，发掘，还有第三个16位，第四个，第五个……
 * 这时候我的脑子里才有了循环的逻辑。而最初我的代码是非常的长的。而用上循环，发现，一下子简洁了！ 2、迭代循环，不能小看，这是大规模处理数据的底层逻辑。
 * 3、数字是从右往左递增的，但往往，我们的数据是从左往右处理的。
 */