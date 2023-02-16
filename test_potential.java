import java.util.*;
public class test_potential
{
    static int getPotential(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum=sum+(int)(str.charAt(i));
        }
        return sum;
    }
    
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any Sentence in upper case: ");
        String myString=sc.nextLine();
        
        if(!(myString.endsWith("?")||myString.endsWith(".")||myString.endsWith("!")))
        {
            System.out.println("Invalid Input");
        }
        else if(!(myString.toUpperCase()).equals(myString))
        {
            System.out.println("Invalid Input - Not in upper case");
        }
        else
        {
            String strArray[]=new String [100];
            String tmpStr="";
            int a=0;
            for(int i=0;i<myString.length();i++)
            {
                if(myString.charAt(i)==' '||myString.charAt(i)=='.'||myString.charAt(i)=='?'||myString.charAt(i)=='!')
                {
                    strArray[a]=tmpStr;
                    tmpStr="";                    
                    System.out.println(strArray[a]+" - "+ getPotential(strArray[a]));
                    a++;
                }
                else
                {
                    tmpStr=tmpStr+myString.charAt(i);
                }                
            }
      
            for(int i=0;i<a;i++)
            {
                
                for(int j=0;j<a-1-i;j++)
                {
                    if( getPotential(strArray[j])> getPotential(strArray[j+1]))
                    {
                        tmpStr=strArray[j];
                        strArray[j]=strArray[j+1];
                        strArray[j+1]=tmpStr;
                    }
                }
            }
            
            for(int i=0;i<a;i++)
            {
                System.out.print(strArray[i]+" ");
            }
        }
    }
}