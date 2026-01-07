
import java.util.Arrays;

public class ArrayFunHouse
{
	//Instance Fields
	private int[] numArray;

	//Default Constructor
	public ArrayFunHouse()
	{
		numArray = new int[1];
		numArray[0]=0;
	}

	//Modified Constructor
	public ArrayFunHouse(int[] newArray)
	{
		//Two ways to transfer in the array
		numArray=newArray;

		//The other way is to create a new array based on the size of the
		//parameter and then transfer all of the data one value at a time from
		//the new into the instance

	}

	//getSum() will return the sum of the numbers from start to stop,
	//not including stop
	//Position does matter, so use traditional for loop
	//IMPORTANT!!!!
	public int getSum(int start, int stop)
	{
		int sum = 0;

		for(int i = start; i < stop; i ++)
			sum += numArray[i];
		return sum;
	}

	//getCount() will return number of times val is present
	//Position does not matter, use a for each loop
	//IMPORTANT!!!!
	public int getCount(int val)
	{
		int count=0;

		for(int x: numArray)
			if(x == val)
				count++;

		return count;
	}

	//toString
	public String toString()
	{
		//There is no print here
		String returnString = "";

		//Build the returnString here which contains the values of numArray
		for(int i=0; i<numArray.length; i++)
		{
			if(i==0)
				returnString += "[" + numArray[0] + " ";
			else if(i==numArray.length-1)
				returnString += numArray[i] + "]";
			else
				returnString += numArray[i] + " ";
		}

		return returnString;
	}
}