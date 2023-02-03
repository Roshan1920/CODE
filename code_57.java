class code_57 {
        public static void main(String[] args){
            System.out.println("Fibonacci(10) = " + fibonacci(10));
          }
          
          public static int fibonacci(int n){
            if(n<0)
              throw new IllegalArgumentException("n should be non-negative");
            else if(n==0)
              return 0;
            else if(n==1)
              return 1;
            else
              return (fibonacci(n-1) + fibonacci(n-2));
          }
}