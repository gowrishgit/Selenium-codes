package Array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int a[][] = new int[2][3]; // Decalred multidimentional array with 2 rows and 3 columns
		a[0][0] = 2; 
		a[0][1] = 4;
		a[0][2] = 8;
		a[1][0] = 4;
		a[1][1] = 8;
		a[1][2] = 16;
		System.out.println("Printing the value of a[0][1] :"+ a[0][1]);

		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.println(a[i][j]);
			}
		}

		int b[][] = { { 2, 4, 8 }, { 4, 8, 16 }, { 1, 3, 5 } }; // Decalred multidimentional array with 3 rows and 3 columns

		System.out.println("Printing the value of b[2][2] :" + b[2][2]);
	}

}
