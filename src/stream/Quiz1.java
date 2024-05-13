package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수구하세요 결과 3
 * 2. 모든 문자열의 길이를 더한 합을 구하세요 결과 13
 * 3. 가장 길이가 짧은 문자열의 길이를 구하세요  결과 1
 * 4. 중복을 제거한 리스트를 만드세요 결과 [aaa, b, ccccc]
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa","aaa","b","b", "ccccc"};
		
//		1.
		Stream<String> stream1 = Arrays.stream(arr); 
		long s = stream1.filter(n->n.length() > 2).count();
		System.out.println(s);
				
		System.out.println();
		
//		2.
		Stream<String> stream2 = Arrays.stream(arr);
		int sum = stream2.map(n -> n.length()).reduce(0,(hap, n) -> hap + n);
//		혹시 최종연산에서 바로 출력 할수도있어요?
		System.out.println(sum);
		
		
//		int sum2 = stream2.mapToInt(s -> s.length()).sum();
//		System.out.println("모든 문자열의 길이를 더한 합: " + sum2);
		
		System.out.println();
		
//		3.
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.map(n -> n.length()).sorted().limit(1).forEach(n -> System.out.println(+ n));
		
//		OptionalInt min = stream3.mapToInt(n -> n.length()).min();
//		System.out.println(min.getAsInt());
		
		System.out.println();
		
//		4.
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> strList = stream4.distinct().collect(Collectors.toList());
		System.out.println(strList);
		
	}

}
