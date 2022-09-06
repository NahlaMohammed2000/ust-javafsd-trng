package thirdday.ust;
//create interface
interface Language{
	void getName(String name);
}
//class implements interface
class ProgrammingLanguage implements Language
{
	public void getName(String name) {
		System.out.println("Programming Language: "+name);
	}
}
public class Getname_eg {
	public static void main(String args[]) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}
}
