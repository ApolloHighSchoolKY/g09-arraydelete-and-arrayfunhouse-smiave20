//� A+ Computer Science
// www.apluscompsci.com

//array delete example

public class ArrayDelete
{
	public static int countIt( int[] iRay, int val )
	{
		int count = 0;

		for(int x: iRay)
		{
			if(x==val)
			{
				count++;
			}
		}

		return count;
	}

	public static int[] removeIt( int[] iRay, int val )
	{
		//Create a new array
		int[] newNums;

		//The new array size is the same as the parameter's 
		//size minus the count of whatever value we are removing
		//Use the countIt method
		newNums = new int[iRay.length - countIt(iRay, val)];

		//Keep track of where I should place values in the new array
		int placed = 0;

		//Go through the original array to find non-"val's"
		for(int x: iRay)
		{
			//If the item is not equal to the "val" copy it
			//into the new array
			if(x!= val)
			{
				//Put the item in the current position in
				//the new array
				newNums[placed] = x;

				//Increase the position
				placed++;
			}
		}
		
		return newNums;
	}

	public static void printIt( int[] iRay  )
	{
		//In here, the array is referred to as iRay
		for(int i=0; i<iRay.length; i++)
		{
			if(i==0)
				System.out.print("[" + iRay[i] + ", ");

			else if (i==iRay.length-1)
				System.out.println(iRay[i] + "]");

			else
				System.out.print(iRay[i] + ", ");
		}
	}

	public static void main(String[] args)
	{
		int[] nums = {7,7,1,7,8,7,4,3,7,9,8};

		//Print the original array and the count of 7's
		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));

		//Remove the 7's
		nums = removeIt( nums, 7 );

		//Print the revised array and the count of 7's
		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
	}
}