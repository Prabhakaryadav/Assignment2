import java.util.Scanner;

public class largestnum {

	public static void main(String[] args) {
		int[] arr = new int[] {5,8,2};
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
		   if(arr[i]>max)
			   max=arr[i];
		}
		System.out.println(max);
	}

}
