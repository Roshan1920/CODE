public class StringBuilder2 {
  public static void main(String args[])
  {
   StringBuilder sb= new StringBuilder("h");
   sb.append("e");// while in string -str= str +"e";
   sb.append("l");
   sb.append("l");
   sb.append("o");
   //Doing this from string method as shown in first case 
   //it would create new string every time resulting in increse of space and time complexity
   System.out.println(sb);

}  
}
