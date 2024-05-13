package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 패키지 여행 떠나는 고객정보 저장 Customer클래스
 * 속성: 이름, 나이, 여행비용
 * 여행 고객리스트를 만들고 고객 추가하세요
 * (둘리, 40살 여행비용 100만), (또치, 13살, 비용 50만), (도우너, 25살, 70만)
 * 
 * 고객리스트 사용하여 정보출력
 * 고객명단
 * 여행 총 비용
 * 20세 이상 고객 찾아서 나이순으로 순정렬, 이름 나이 출력
 * 
 * -고객명단- 
 * 둘리 또치 도우너
 * 총 여행비용 220
 * -20세 이상 고객 명단-
 * 도우너 25, 둘리 40
 * */

public class Quiz4 {

	public static void main(String[] args) {
		
		List<Customer> customer = new ArrayList<>();
		
		customer.add(new Customer("둘리", 40, 100));
		customer.add(new Customer("또치", 13, 50));
		customer.add(new Customer("도우너", 25, 70));
		
//		1.
		Stream<Customer> stream1 = customer.stream();
		stream1.map(s -> s.name).forEach(s -> System.out.print(s +" "));
		
		System.out.println();
		
//		2.
		Stream<Customer> stream2 =customer.stream();
		int sum1 = stream2.mapToInt(s -> s.cost).sum();
		System.out.println("여행 총 비용 " + sum1);
		
//		3.
		Stream<Customer> strema3 = customer.stream();
		strema3.filter(s -> s.age >= 20).map(s -> s.name).forEach(s -> System.out.println(s));
//		이건 이름만
		
//		3.1
		Stream<Customer> strema4 = customer.stream();
		strema4.filter(s -> s.age >= 20)
		.sorted((o1, o2) ->{
			if(o1.age > o2.age) {
				return 1;
				}else {
					return -1;
				}
		}).forEach(s -> System.out.println(s.name + ", " + s.age));
				
		
		
//		순정렬
//		int compare(T o1, T o2) {
//			if(o1.age > o2.age) {
//				return 1;
//			} else {
//				return -1;
//			}
		}
		
	}


class Customer {

	String name;
	int age;
	int cost;

	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
	

}
