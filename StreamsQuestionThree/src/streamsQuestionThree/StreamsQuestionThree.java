package streamsQuestionThree;

import java.util.Arrays;
import java.util.List;

public class StreamsQuestionThree {
//Create a method that takes a List of Strings and returns a single string, comprising of all strings in the original list separated by a single space " ".

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Hello", "It's", "Dale");
		String output = stringList.stream().reduce((a, b) -> a + " " + b).get();
		System.out.print(output);
	}	
}