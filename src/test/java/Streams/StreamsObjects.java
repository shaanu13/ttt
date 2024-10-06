package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsObjects {
	
public static void main(String[] args) {
	
	//Arrays
	
	 IntStream stream4 = Arrays.stream(new int[]{1,5,2,3,4,5,6});
	 OptionalDouble average = stream4.average();
	 System.out.println(average);
	 System.out.println(average.getAsDouble());
	// stream4.

	 OptionalInt sum = Arrays.stream(new int[]{1,5,2,3,4,5,6}).max();
	 System.out.println(sum);
	 System.out.println(sum.getAsInt());
	 
	 //(s->System.out.println(s));
	String[] s= new String[3];
	s[0]="Anu";
	s[1]="sha";
	s[2]="hope";
	Stream<String> stream3 = Arrays.stream(s);
	
	Character [] c=  {'a','b','c'};
	ArrayList al= new ArrayList(Arrays.asList(1,2,3,4,5,6,4,5));
	Optional stream5 = al.stream().findAny();
	
	System.out.println(stream5);
	System.out.println(stream5.get());

	Stream<Character> stream = Arrays.stream(c);
	Stream<Integer> stream2 = Arrays.stream(new Integer[] {1,2,2,3});
	
	ArrayList<Integer> al1 = new ArrayList(Arrays.asList(1,2,3,4,3,56,78,868,98));
	al1.stream().distinct().forEach(System.out::println);
	al1.stream().sorted().forEach(System.out::println);
	al1.stream().sequential().forEach(System.out::println);
	
	int[] arr = {1, 2, 3, 4, 5};
	int index = Arrays.binarySearch(arr, 3);
	System.out.println(index); // Output: 2 (index of value 3)

	int[] unsortedArr = {3, 1, 4, 2};
	int notFoundIndex = Arrays.binarySearch(unsortedArr, 3);
	System.out.println(notFoundIndex);
	
	
	
	
}
}
