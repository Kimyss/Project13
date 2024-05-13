package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
//		구현클래스 사용하여 helloPrint() 호출
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();
		
//		익명클래스 사용하여 helloPrint() 호출
		
		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
			hello2.helloPrint();
		
		
//		람다식함수 사용하여 helloPrint() 호출
		Hello hello3 = () ->System.out.println("안녕하세요");
		hello3.helloPrint();
	}

}


interface Hello{
	
//	안녕하세요 출력메소드
	void helloPrint();
	
}
// 부모 ↑
// 자식 ↓
//Q. Hello의 구현 클래스만들기

class HelloImpl implements Hello{

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
		
	}
	
}
