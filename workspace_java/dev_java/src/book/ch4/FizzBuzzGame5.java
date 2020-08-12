package book.ch4;

public class FizzBuzzGame5 {
	public void methodA() {
		int i = 1;
		//1부터 100까지 센다
		//for(int i=start;i<=end;i++) {
		while(i<101) {	
			switch(i%35) {
				case 0: {
					System.out.println("fizzbuzz");
					break;
				}
				case 5: case 10: case 15: case 20: case 25: {
					System.out.println("fizz");
					break;
				}
				case 7: case 14: case 21: case 28: {
					System.out.println("buzz");		
					break;
				}
				default: {
					System.out.println(i);
				}
			}
			i = i + 1;
		}///////////end of while	
		//insert here - i값은 얼마?
	}
	public static void main(String[] args) {
		FizzBuzzGame5 fbg = new FizzBuzzGame5();
		fbg.methodA();
	}//////////////end of main
}//////////////////end of FizzBuzzGame1
