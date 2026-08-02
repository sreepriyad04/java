package generics.pairclass;

public class Pair<T,V> {
	private T first;
	private V second;
	
	public Pair(T first, V second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public T getFirst(){
		return (T) first;
	}
	public V getSecond() {
		return second;
	}

}
