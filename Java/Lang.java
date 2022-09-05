package abst.ust;
abstract class Language{
	//method of abstract class
	public void display() {
		System.out.println("Java programming");
	}
}
public class Lang extends Language {
	public static void main(String[] args) {
		Lang l=new Lang();
		l.display();
	}

}
