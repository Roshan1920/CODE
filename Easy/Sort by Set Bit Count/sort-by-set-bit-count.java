//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++)
            output.append(arr[i] + " ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
    //this method takes an array of Integer objects (arr) and the size of the array (n) as parameters. 
    //It will sort the array based on the count of set bits.
        
        Arrays.sort(arr, (x,y)->Integer.bitCount(y)-Integer.bitCount(x));
        
        //Arrays.sort() method to sort the arr array. 
        //It uses a lambda expression (x, y) -> Integer.bitCount(y) - Integer.bitCount(x) as the comparator.
        
        /* The lambda expression Integer.bitCount(y) - Integer.bitCount(x)  calulates the
        difference between the set bit counts of y and x. */
        
        //By sorting in descending order of the set bit counts, the array will be sorted accordingly.

    } 
}
