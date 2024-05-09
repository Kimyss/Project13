package innerclass.ex1;



class A{
	int num = 10;
}

class B{
	
	void method() {
		A a = new A();
		System.out.println(a.num);
	}
}

// ↑ 일반적으로 클래스를 만들고 사용하는 방법  A의 객체를 생성후 사용
