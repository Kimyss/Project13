package lambda;

public class Ex2 {

	public static void main(String[] args) {
		
//		부모타입 변수 선언 =  람다식 함수
//		여기서 부모는 인터페이스
		Calc calc = (num1, num2) -> num1 + num2;
		System.out.println(calc.add(5, 10));
		
		
//		람다식의 동작 원리
//		컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		Calc calc2 = new Calc() {
			
			@Override
			public int add(int num1, int num2) {
				return 0;
			}
		};
	}

}

// 함수형 인터페이스

// 함수형 이노테이션을 나타내는 이노테이션.
// 추상메소드가 한개이상 추가되는 것을 막음
@FunctionalInterface		//억제기(?)
interface Calc{
	int add(int num1, int num2);
}
