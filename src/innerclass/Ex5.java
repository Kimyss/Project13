package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 {

	public static void main(String[] args) {

//		1. 화면 만들기
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		Button button = new Button("Click");
		frame.add(button);

		
//		2. 버튼 이벤트 등록하기
//		button.addActionListener(new EventHandler());
//		외부 클래스로 객체 만들고사용(?)

//		3. 안에 객체넣어야해 중괄호안에 구현부 ㄱㄱ
//		   일반클래스 대신 익명클래스로 사용 여기서만 사용하기에 이벤트핸들러없이 여기서만 쓰고만 코드
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다");
			}

		});

	}

}

//	클래스로 인터페이스 구현하기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다");

	}

}