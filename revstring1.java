public class revstring1 {
  public static void main(String args[])  
  {  
    

    StringBuilder name= new StringBuilder("raghav");

    System.out.println("Given name is");
    for (int i=0;i<name.length();i++)
    {
        int front=i;
        int back= name.length()-1-i;
        
       char frontchar=  name.charAt(front);
       char backchar = name.charAt(back);
     
        name.setCharAt(front,backchar);
        name.setCharAt(back,frontchar);
    }
   System.out.println(name);
  }
}
