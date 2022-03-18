
import java.util.HashMap;
import java.util.Map;

class q2 {
	public static void main(String[] args)
	{

		String str = "Hi this is Hi";
		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = hashMap.get(word);
			if (integer == null)
				hashMap.put(word, 1);
			else {
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}
}
