package book.ch4;

public class ArrayTest {

	public static void main(String[] args) {
		int is[] = new int[3];//한번에 방이 세개가 생기죠
		is[0] = 1;
		is[1] = 2;
		is[2] = 3;
		double ds[] = new double[1];//방이 하나만 생겨요
		for(int j=0;j<3;j++) {
			System.out.println(is[j]);
		}
	}

}
