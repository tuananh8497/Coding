package abc;

public class Recursion {

  public static void main(String[] args) {
    int number = 4;
    int result = factorial(number);
    System.out.println(number + " factorial = " + result);
  }

  public static void countdown(int num){
          if(num == 0)
             System.out.println("Blast Off!");
          else {
              System.out.println(num);
              countdown(num-1);            
          }   
      } 
  
  static int factorial( int n ) {
    if (n != 0)
        return n * factorial(n-1); // recursive call
    else
        return 1;
}
}
