package book.ch4;

import javax.swing.JOptionPane;
//모든 클래스는 Object로 부터 상속받아서 만들어 진 것이다.
public class IFTest extends Object{

	public static void main(String[] args) {
		//사용자로 부터 점수를 입력 받는다.
		//사용자가 입력한 점수를 담을 변수를 선언하세요.
		//사용자가 입력한 값을 받는 방법은 무엇입니까?
		//또 그 값을 받았을때 타입은 뭐죠?
		String jumsu = JOptionPane.showInputDialog("점수를 입력하세요.");
		int i_jumsu = Integer.parseInt(jumsu);
		if(i_jumsu>=90) {
			System.out.println("당신은 A학점을 받았습니다.");
		}
		else if(i_jumsu<90 && i_jumsu>=80) {
			System.out.println("당신은 B학점을 받았습니다.");			
		}
		else if(i_jumsu<80 && i_jumsu>=70) {
			System.out.println("당신은 C학점을 받았습니다.");			
		}
		else if(i_jumsu<70 && i_jumsu>=60) {
			System.out.println("당신은 D학점을 받았습니다.");			
		}
		else {
			System.out.println("당신은 F학점을 받았습니다.");						
		}
	}

}
