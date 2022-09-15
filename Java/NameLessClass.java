package sixth.ust;
//Anonymous class eg
abstract class Animal{
	abstract void Sound();
}
public class NameLessClass {
	
	public static void main(String[] args) {
		Animal a=new Animal() {
			void Sound() {
				System.out.println("Animal sound");
			}
		};
		a.Sound();
		
	}
}
