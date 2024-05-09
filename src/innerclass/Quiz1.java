package innerclass;

/*
 * 두가지방법으로 이벤트등록
 * 1. 일반클래스 사용
 * 2. 익명클래스 사용
 * */

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Quiz1 {

	public static void main(String[] args) {
//		화면 생성
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		

//		미리 구현한 클래스로 키이벤트 등록하기
		KeyAdapter adapter = new MyKeyListener();
		frame.addKeyListener(adapter);

//		익명클래스로 키 이벤트 등록
//		frame.addKeyListener(new KeyAdapter() {
//			public void keyPressed(KeyEvent e) {
//				System.out.println("키를 눌렀습니다!");
//			}
//		});

	}

}

// 클래스로 인터페이스 구현하기

class MyKeyListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다!");
	}

}
