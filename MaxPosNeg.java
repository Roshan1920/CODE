import java.io.*;

public class MaxPosNeg {
	
	
	static int findMaximum(int arr[], int size)
	{
	
		int i = 0, j = size - 1, mid;
	
		while (i <= j) {
	
			
			mid = i + (j - i) / 2;
	
			if (arr[mid] < 0)
				i = mid + 1;
	
			
			else if (arr[mid] > 0)
				j = mid - 1;
		}
	
		return Math.max(i, size - i);
	}
		public static void main (String[] args)
	{
		int arr[] = { -9, -2, 1, 8, 6 };
		int N = arr.length;
	
		System.out.println(findMaximum(arr, N));

	}

}
