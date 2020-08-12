package book.ch2;

public class P49 {
	//전역변수는 클래스 전역에서 사용할 수 있다.
	int i;//전역변수-heap[global variable, member variable, instance variable]
	//i=2;
	public static void main(String[] args) {
		P49 p49 = new P49();
		p49.methodA();
		int i = 5;//지역변수-stack[local variable, automatic variable]
		i = 10;
		p49.methodB(i);//<==========================여기
		float f = 3.14f;
		double d = 3.1456;
		boolean isOk;
		isOk=false;
		System.out.println(isOk);
	}
	void methodA() {
		System.out.println("전역변수 i==>"+i);//5
		//질문 : methodA에서 10번에서 선언한 변수 i값 10을 출력하고 싶은데.... 가능한가요?
	}
	void methodB(int i) {//파라미터에 선언한 변수도 지변이다.
		System.out.println("지역변수 i는 "+i);//10
	}
}







