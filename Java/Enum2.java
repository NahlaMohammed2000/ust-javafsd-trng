package sixth.ust;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
class Test{
	Size pizzaSize;
	public Test(Size pizzaSize) {
		this.pizzaSize=pizzaSize;}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;
		default:
			System.out.println("No order");
			break;
			
		}
	
}
}
public class Enum2 {
public static void main(String[] args) {
	Test t1=new Test(Size.MEDIUM);
	t1.orderPizza();
}
	
}

