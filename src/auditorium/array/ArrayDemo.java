package auditorium.array;

import auditorium.util.ArrayUtil;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] a = null;
		int [] aa = {};
		int [] aaa = {1, 2, 3};
		int [] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 * i;
		}

		int [][] twoDim = {{}};
		ArrayUtil.print(twoDim);

		System.out.println("twoDim.length : " + twoDim.length);

		twoDim[0] = aaa;
		ArrayUtil.print(twoDim);
	}
}
