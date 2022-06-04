package Main;

class Box2<T>{
	private T data;
	public void set(T data) { this.data=data; }
	public T get() { return data; }
}

public class GenericEX {
  public static void main(String[] args) {
	  Box2<String> b = new Box2<String>();
	  b.set("Hello World");
	  String s=b.get();
	  System.out.println(s);
	  
	  Box2<Integer> a = new Box2<Integer>();
	  a.set(100);
	  System.out.println(a.get());
  }
}
