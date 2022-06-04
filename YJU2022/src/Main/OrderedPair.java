package Main;
// 다중 타입 매개변수
interface Pair<K,V>{
	public K getKey();
	public V getValue();
}

public class OrderedPair<K,V> implements Pair<K,V> {
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
	 this.key = key;
	 this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
	
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Enve",8);
		Pair<String, String> p2 = new OrderedPair<String, String>("Hello", "World");
	}

}
