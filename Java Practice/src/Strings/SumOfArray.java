package Strings;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 2, 4, 6, 8, 10 };
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			sum = sum + c[i];
		}
		System.out.println("The Sum of number is :" + sum);
	}

}
