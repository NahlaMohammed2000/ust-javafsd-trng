package fourthday.ust;
class Test20<T>{
	T obj;
	Test20(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}
public class Generics_eg2 {
	public static void main(String args[]) {
		Test20<Integer>iObj=new Test20<Integer>(15);
		System.out.println(iObj.getObject());
		Test20<String>sObj=new Test20<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		//iObj=sObj;
	}
	
}
