package lambda;

public class Quiz1 {

	public static void main(String[] args) {

//		구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MyNumberImpl();
//		MyNumberImpl number1 = new MyNumberImpl();  **참고 형변환 규칙에 의하여 부모타입, 본인 둘다 올 수 있다.

		System.out.println(number1.max(19, 20));

//		Q. 익명 클래스 사용 max() 호출하세요
		MyNumber number2 = new MyNumber() {
//			(추상메소드를 오버라이드 해주세요)
			@Override
			public int max(int x, int y) {
				return x > y? x : y;    //꼭 삼항연산자 아니어도 됩니다.
				
//				int max = x > y? x : y;
//				return max;			 
			}
		};
		System.out.println(number2.max(10,30));
			
		
//		Q. 람다식 함수 사용 max() 호출하세요
		MyNumber number3 = (x, y)->  {
			int max =  x > y? x: y;
			return max;
		};
		System.out.println(number3.max(20, 10));
		
	}

}

// 함수형 인터페이스
interface MyNumber {

//	더 큰 값을 구하는 메소드
	int max(int x, int y);

}

// 구현 클래스 만들기
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
}
