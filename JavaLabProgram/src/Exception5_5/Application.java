package Exception5_5;

public class Application{
    public static void main(String args[]){
          Machine machine = new Machine();
          String name[]={"苹果","炸药","西装","硫酸","手表","火柴"};
          Goods [] goods = new Goods[name.length];//检查6件物品
          for(int i=0;i<name.length;i++){
               goods[i]= new Goods();
               if(i%2==0){
                   goods[i].setIsDanger(false);
                   goods[i].setName(name[i]);
                }
               else{
                   goods[i].setIsDanger(true);
                   goods[i].setName(name[i]);
                }
              
               }
          
       	   for(int i = 0 ; i < name.length; i++) {
       		try {   
       			machine.checkBag(goods[i]);
       		}
       		catch(DangerException e){
       			System.out.print(goods[i].getName() + ": ");
       			e.toShow();
       		}
       	   }
    }
}
