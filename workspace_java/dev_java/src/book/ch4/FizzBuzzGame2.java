package book.ch4;

public class FizzBuzzGame2 {
	public void methodA() {
		//1부터 100까지 센다
		for(int i=1;i<=100;i++) {
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
	}
	public static void main(String[] args) {
		FizzBuzzGame2 fbg = new FizzBuzzGame2();
		fbg.methodA();
	}//////////////end of main
}//////////////////end of FizzBuzzGame1
