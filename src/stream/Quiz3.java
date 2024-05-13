package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 클래스 만드세요 쇼핑몰
 * 속성 : 주문번호, 주문연도, 거래내역(만원단위)
 * [orderNo = 1001, year = 2022, price = 300] [orderNo = 1002, year = 2022, price = 150]
 * [orderNo = 1003, year = 2022, price = 200] [orderNo = 1004, year = 2023, price = 500]
 * [orderNo = 1005, year = 2023, price = 400] [orderNo = 1006, year = 2023, price = 600]
 * [orderNo = 1007, year = 2023, price = 650]
 * 
 * 1. 모든 거래번호 한줄에 나열하세요
 * 1001 1002 1003 1004 1005 1006 1007
 * 
 * 2. 2022년도의 거래 총금액과 거래건수 출력하세요
 * 총금액 650 건수 3
 * 
 * 3.2023년도의 거래 총금액과 건수 출력하세요
 * 총금액 2450 건수 4
 * */

public class Quiz3 {

	public static void main(String[] args) {

//		거래내역 원본데이터 리스트생성
		List<ShoppingMall> shop = new ArrayList<>();

		shop.add(new ShoppingMall(1001, 2022, 300));
		shop.add(new ShoppingMall(1002, 2022, 150));
		shop.add(new ShoppingMall(1003, 2022, 200));
		shop.add(new ShoppingMall(1004, 2023, 500));
		shop.add(new ShoppingMall(1005, 2023, 400));
		shop.add(new ShoppingMall(1006, 2023, 600));
		shop.add(new ShoppingMall(1007, 2023, 650));

//		ShoppingMall sp1 = new ShoppingMall(1001, 2022, 300);
//		ShoppingMall sp2 = new ShoppingMall(1002, 2022, 150);
//		ShoppingMall sp3 = new ShoppingMall(1003, 2022, 200);
//		ShoppingMall sp4 = new ShoppingMall(1004, 2023, 500);
//		ShoppingMall sp5 = new ShoppingMall(1005, 2023, 400);
//		ShoppingMall sp6 = new ShoppingMall(1006, 2023, 600);
//		ShoppingMall sp7 = new ShoppingMall(1007, 2023, 650);
//
//		List<ShoppingMall> list = Arrays.asList(sp1, sp2, sp3, sp4, sp5, sp6, sp7);

//		1.
		Stream<ShoppingMall> stream1 = shop.stream();
		stream1.map(s -> s.orderNo).forEach(s -> System.out.println(s));

		System.out.println();
//		filter 조건만족 요소추추출 2022년
//		mapToInt 값을 int형으로 변환 order객체 ->int 타입의 price필드
//		sum 요소의 합구하기

//		2.
		Stream<ShoppingMall> stream2 = shop.stream();
		int sum1 = stream2.filter(s -> s.year ==2022).mapToInt(s -> s.price).sum();
		System.out.println(sum1);
		
		Stream<ShoppingMall> stream3 = shop.stream();
		long b = stream3.filter(o -> o.year == 2022).count();
		System.out.println("2022년도의 거래건수: " + b);
		
		System.out.println();
		
//		3.
		Stream<ShoppingMall> stream4 = shop.stream();
		int sum2 = stream4.filter(o -> o.year == 2023).mapToInt(o -> o.price).sum();
		System.out.println("2023년도의 거래 총금액: " + sum2);
		
		Stream<ShoppingMall> stream5 = shop.stream();
		long count2 = stream5.filter(o -> o.year == 2023).count();
		System.out.println("2023년도의 거래건수: " + count2);

	}

}

//	쇼핑몰 주문내역 저장 클래스
class ShoppingMall {
	int orderNo;
	int year;
	int price;

	public ShoppingMall(int orderNo, int year, int sale) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = sale;
	}

//	출력할 필요는 없기 때문에 생략해도 됐었다.
//	@Override
//	public String toString() {
//		return "ShoppingMall [orderNo=" + orderNo + ", year=" + year + ", sale=" + price + "]";
//	}

}


// map함수의 인자는 Function
// 추상메소드의 기능은 해당 연산자의 기능과 같다

// 이 함수는 요소를 다른값으로 바꿔서 변환하는 함수
// 리턴타입 R? 제네릭 타입이라는거. 니가 정하면됨

//R apply (T t) {	//t는 주문객체
//	return t.orderNo;	//주문번호로 바꿔서 변환
//}			==>람다식으로 바꾸면됩니다
