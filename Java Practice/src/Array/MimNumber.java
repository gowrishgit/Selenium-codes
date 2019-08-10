package Array;

public class MimNumber {

	public static void main(String[] args) {
		/*
		  2 4 8
		  4 8 16
		  1 3 5
		
		finf the min number and identify the max number in that column
		Solution
		step 1: find the min
		step 2: identify the column of min number
		step 3: find the max number of the identifed column 
		 */
		
		
		int a[][] = { { 2, 4, 8 }, { 4, 8, 16 }, { 1, 3, 5 } }; 
		int min=a[0][0];
		int mincolumn = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				
				if(a[i][j]<min)
				{
					min=a[i][j]; //step 1: find the min
					mincolumn=j; //step 2: identify the column of min number
					
				}
			}
		}
		
		int max=a[0][mincolumn]; //step 3: find the max number of the identifed column 
		int k=0;
		while(k<3)
		{
			if(a[k][mincolumn]>max) 
			{
				max=a[k][mincolumn];
			}
			k++;
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
