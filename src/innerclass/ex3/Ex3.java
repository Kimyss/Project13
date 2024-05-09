package innerclass.ex3;

public class Ex3 {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.InstanseInner instanseInner = outer.new InstanseInner();
		instanseInner.i1 = 300; // 인스턴스변수
		instanseInner.i2 = 300; // 정적변수 static

		Outer outer2 = new Outer();
		Outer.InstanseInner instanseInner2 = outer2.new InstanseInner();
		instanseInner2.i1 = 400;
		instanseInner2.i2 = 400;

		System.out.println("첫번째 인스턴스 내부클래스:" + instanseInner.i1 + ", " + instanseInner.i2);
		System.out.println("첫번째 인스턴스 내부클래스:" + instanseInner2.i1 + ", " + instanseInner2.i2);

		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.i1 = 300;
		staticInner.i2 = 300;
	}

}

class Outer {
//		인스턴스 내부 클래스 인스턴스변수 + 정적변수 모두 가질 수 O
	class InstanseInner {
		int i1 = 100;
		static int i2 = 200;
//		정적변수는 외부 객체에 종속됨
	}

//		정적 내부 클래스 인스턴스변수 + 정적변수 모두 가질 수O
	static class StaticInner {
		int i1 = 100;
		static int i2 = 200;
	}

}
