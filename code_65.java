    import java.util.Scanner;  
public class code_65
{  
static boolean isPowerful(int n)  
{ 
while (n % 2 == 0)   
{  
int power = 0;  
while (n % 2 == 0)   
{  
n = n/ 2;  
power++;  
} 
if (power == 1)  
return false;  
}  
for (int factor = 3; factor <= Math.sqrt(n); factor += 2)   
{  
int power = 0;   
while (n % factor == 0)   
{  
n = n / factor;  
power++;  
}   
if (power == 1)  
return false;  
}  
return (n == 1);  
} 
static boolean isPower(int a)  
{  
if (a == 1)  
return true;  
for (int i = 2; i * i <= a; i++)   
{  
double val = Math.log(a) / Math.log(i);  
if ((val - (int)val) < 0.00000001)  
return true;  
}  
return false;  
}  
static boolean isAchilles(int n)  
{  
if (isPowerful(n) && !isPower(n))   
return true;  
else  
return false;  
}  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
int n=sc.nextInt();  
if (isAchilles(n))  
System.out.println("The given number is an Achilles number.");  
else  
System.out.println("The given number is not an Achilles number.");  
sc.close();  
}  

    
}
