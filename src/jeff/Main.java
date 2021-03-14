package jeff;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> data = new HashMap<>();
		Sample s = new Sample(data);
		System.out.println(s.getData("foo"));
	}
}
