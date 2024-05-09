package lambda;

public class Quiz1 {

	public static void main(String[] args) {

//		구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MyNumberImpl();
//		MyNumberImpl number1 = new MyNumberImpl();  **참고 형변환 규칙에 의하여 부모타입, 본인 둘다 올 수 있다.

		System.out.println(number1.max(19, 20));

//		Q. 익명 클래스 사용
		
		
//		Q. 람다식 함수 사용
		
		
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
