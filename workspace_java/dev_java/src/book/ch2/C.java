package book.ch2;

import javax.swing.JOptionPane;

public class C {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("첫번째 숫자를 입력하고 엔터치기");
		System.out.println(s);
		String s2 = JOptionPane.showInputDialog("두번째 숫자를 입력하고 엔터치기");
		System.out.println("s2==============>"+s2);
	}

}
