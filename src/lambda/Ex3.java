package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
//		1. 구현 클래스로 인터페이스 구현하기
		
		List<String> list = new ArrayList<>();
		
		list.add("add");
		list.add("ccc");
		list.add("bbb");
		
		System.out.println(list);
		System.out.println();
		
//		리스트의 데이터를 순서대로 정렬하는 메소드
//		인자 : 1) 문자열 리스트
//		      2) 리스트를 정열하는 로직을 가지고있는 Comparator 클래스
//		Collections.sort(list, Comparartor를 구현한 클래스);

		
//		2. 익명클래스로 인터페이스 구현하기
		Collections.sort(list, new Comparator<String> () {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);	//순정렬
			}
		});
		
		System.out.println("리스트 순정렬 " + list);
		
			
//		3. 람다식으로 인터페이스 구현하기
//		Collections.sort(list, 람다식함수);
		Collections.sort(list, (o1,o2) -> o2.compareTo(o1));  //인자 뒤바꾸면 역정렬
		System.out.println(list);
		
		
		
		

	}

}
