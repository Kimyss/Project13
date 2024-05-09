package innerclass.ex4;

class Outer {

	private int a = 10;
	private static int b = 20;
	

//	인스턴스 내부 클래스
	class InClass {
		int i1 = a; // 외부 클래스의 private멤버도 사용가능
		int i2 = b;
	}
	
//	static이 붙어 있는 정적 내부 클래스
	static class InStaticClass {
		int i2 = b;
	}
}	


//	** 접근제어자 (4가지)
//	** public 패키지, 장소상관없이 사용가능
//	** private 클래스 안에서만
