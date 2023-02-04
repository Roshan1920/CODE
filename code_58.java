import java.io.*;

public class code_58 {
	public static String reverse_sentence(String str)
	{
		if (str.isEmpty())
			
			return str;
		else {
		
			char ch = str.charAt(0);
		
			return reverse_sentence(str.substring(1)) + ch;
		}
	}

	public static void main(String[] args)
	{
		
		String str = "this sentence is reversed";
	
		String rev_str = reverse_sentence(str);
	
		System.out.println(
			"Sentence in reversed form is : " + rev_str);

		
}
}
