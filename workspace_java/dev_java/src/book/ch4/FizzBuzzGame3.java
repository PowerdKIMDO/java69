package book.ch4;

public class FizzBuzzGame3 {
	public void methodA(int start, int end) {
		//1부터 100까지 센다
		for(int i=start;i<=end;i++) {
			if((i%5==0)&&(i%7==0)) {
				System.out.println("fizzbuzz");
			}else if(i%5==0) {
				System.out.println("fizz");				
			}else if(i%7==0) {
				System.out.println("buzz");				
			}else {
				System.out.println(i);
			}
		}	
		//insert here - i값은 얼마?
	}
	public static void main(String[] args) {
		FizzBuzzGame3 fbg = new FizzBuzzGame3();
		fbg.methodA(5,10);
	}//////////////end of main
}//////////////////end of FizzBuzzGame1
