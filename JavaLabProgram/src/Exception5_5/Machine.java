package Exception5_5;

public class Machine {
	public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {              
            throw new DangerException();
        }else {
        	System.out.println(goods.name + "不是危险品");
        }
	}
}
