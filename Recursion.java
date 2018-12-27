public class Recursion{
   //part1: factorial non-recursion
   
   public static int factorial(int n){
      int mul = 1;
      for(int i = 2; i <= n ; i++){
         mul *= i;
      }
      return mul;
   }
   
   //part2: factorial recursion
   
   public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
   
   //part3: fibonacci sequence non-recursion
   
   public static int Fibonacci(int n){
      int a = 1;
      int b = 1;
      int sum = 0;
      for(int i = 3; i <= n;i ++){
         a
   
   //part4: fibonacci sequence recursion
   public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

}
