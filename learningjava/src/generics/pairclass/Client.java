package generics.pairclass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<String, Integer> pair = new Pair("Priya",24);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	}

}
