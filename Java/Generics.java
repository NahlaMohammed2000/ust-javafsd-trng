package fourthday.ust;

public class Generics<T> {
	
	T t;
	public T get() {
		return t;
	}
	
	
	public void set(T t) {
		this.t=t;
	}
	public static void main(String args[]) {
		Generics<String> g=new Generics<>();
		Generics<Integer> h=new Generics<>();
		g.set("hi");
		System.out.println(g.get());
		h.set(100);
		System.out.println(h.get());
	}
}
