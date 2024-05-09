package innerclass;

/*
 * 두가지방법으로 addFocusListener  
 * 1. 일반클래스 사용
 * 2. 익명클래스 사용
 * "텍스트상자에 포커스되었습니다" "벗어났습니다." 출력 
 * */

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Quiz2 {

	public static void main(String[] args) {
		
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea textArea = new TextArea("텍스트상자", 10, 50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
//		기본클래스 구현
//		textEvent textE = new textEvent();
//		textArea.addFocusListener(textE);
		
//		익명클래스 구현
		textArea.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트 포커스 되었습니다.");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트 벗어났습니다.");
				
			}
		});

	}
}

class textEvent implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포커스되었어요");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("벗어났어요");
		
	}
	
}
		
