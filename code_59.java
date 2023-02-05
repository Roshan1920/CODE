import java.io.*;

class code_59 {
	
	public static int calculate_sum_using_recursion(int arr[], int i,
								int length)
	{
		if (i == length) {
			return 0;
		}
	
		return arr[i]
		+ calculate_sum_using_recursion(arr, i + 1,length);
	
	}

	public static void main(String[] args)
	{
	
		int N = 5, total_sum = 0;
	
		int arr[] = { 10, 20, 30, 60, 70 };
	
		total_sum = calculate_sum_using_recursion(arr, 0, N);
	
		System.out.println("The total of N numbers is : "
						+ total_sum);
	}
}
