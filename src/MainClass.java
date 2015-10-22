import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) 
	{
		int [] myArray;
		myArray = new int [6];
		
		myArray[0] = 123;
		myArray[1] = 456;
		myArray[2] = 479;
		myArray[3] = 135;
		myArray[4] = 246;
		myArray[5] = 135;
		
		Arrays.sort(myArray);
		
		
		int avg = (myArray[0] + myArray [1] + myArray [2] + myArray [3] +
				myArray [4] + myArray [5]) / 6;
		
		for (int x=0; x < myArray.length; x++)
		{
			System.out.println("nums: " + myArray[x]);
		}
		System.out.printf("Average is: %d", avg);
	}

}
