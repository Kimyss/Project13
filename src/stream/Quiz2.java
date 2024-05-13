package stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 *[file1.txt, file2.pdf, file3.txt, file4.img, file5.txt, file6.img]
 * 1. txt만 찾으세요
 * 2. 확장자별로 파일개수 구하세요
 * 3. 확장자만 추출하여 출력하세요 (hint! (.)점은 문자기호로 (\\.)으로 표현합니다 )
 * 개수가 유지되어야 하나 자료형이 유지되어야하나 값이 유지되어야하나를 따져서 중간연산 선택
 * */

public class Quiz2 {
	
//	boolean test(T t) {
//		return t.endsWith(".txt");
//	}

	public static void main(String[] args) {
		
		String[] fileList = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		
//		1.
//		filter : 조건을 만족하는 요소'만' 추출
		Stream<String> stream1 = Arrays.stream(fileList);
		stream1.filter(s -> s.endsWith(".txt")).forEach(s -> System.out.println(s));
		
		System.out.println();
		
//		2.
		Stream<String> txtStream = Arrays.stream(fileList);
		long a = txtStream.filter(s -> s.endsWith(".txt")).count();
		System.out.println("txt 개수: " + a);
		
		Stream<String> pdfStream = Arrays.stream(fileList);
		long b = pdfStream.filter(s -> s.endsWith(".pdf")).count();
		System.out.println("pdf 개수: " + b);
		
		Stream<String> imgStream = Arrays.stream(fileList);
		long c = imgStream.filter(s -> s.endsWith(".img")).count();
		System.out.println("img 개수: " + c);
		
		System.out.println();
//		3.
//		map: 값을 다른 값으로 변경 값 자체 변경 
//		distinct : 중복제거
		
		Stream<String> stream5 = Arrays.stream(fileList);
//		stream5.filter(s->s.substring(s.lastIndexOf("."))).forEach(s -> System.out.println(s));
		stream5.map(s -> {
			String[] strArr = s.split("\\.");
			return strArr[1];
		}).distinct().forEach(s -> System.out.println(s));
	}

}
