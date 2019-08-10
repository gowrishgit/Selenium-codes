package Strings;

public class PrintIndex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c[] = { 2, 4, 6, 8, 10, 12, 14 }; //values in array
		
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println("The Index value is :" + c[i]);
			
			if (c[i] == 10) //check the index value of 10
			{
				System.out.println("The Index of number you are looking :" + i);
				break; // Break after getting the value of index
			}
		}
		
	}

}
