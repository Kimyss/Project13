package lambda;

public class Ex1 {

	public static void main(String[] args) {
		
//		클래스로 인터페이스 구현하기	객체와 같은타입을 쓸 수도 있고 부모타입으로 형변환도 가능해요 스트링콘캣임플이어도되요
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "World");
		
//		람다식으로 인터페이스 구현하기
		StringConcat concat2 = (s1,s2) -> System.out.println(s1 + ", " + s2);
		concat2.makeString("Hi", "korea");
		
	}

}


// 함수형 인터페이스
interface StringConcat{
	
//	두 문자열을 연결하는 추상 메소드
	public void makeString(String s1, String s2);
	
}

// 구현 클래스 만들기
class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
		
	}
	
}
