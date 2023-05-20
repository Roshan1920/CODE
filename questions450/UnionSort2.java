import java.util.*;
public class UnionSort2 {
	public static ArrayList<Integer>
	Unionarray(int arr1[], int arr2[],
			int n, int m)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// Remove the duplicates from arr1[]
		for (int i =0;i<arr1.length;i++)
		{
			if(map.containsKey(arr1[i]))
			{
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
			else
			{
				map.put(arr1[i], 1);
			}
		}
		
		// Remove duplicates from arr2[]
		for (int i =0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]))
			{
				map.put(arr2[i], map.get(arr2[i]) + 1);
			}
			else
			{
				map.put(arr2[i], 1);
			}
		}
		
		// Loading set to array list
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : map.keySet())
		{
			list.add(i);;
		}

		return list;
	}
	
	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 4, 5, 5, 6, 6 };
		int n = arr1.length;
		int m = arr2.length;
		System.out.println("Union is :");
		
		ArrayList<Integer> uni
			= Unionarray(arr1, arr2, n, m);
		for (int i : uni) {
			System.out.print(i + " ");
		}
	}
}

