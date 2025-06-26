// Task for today: 
// Define a function to accept a number as parameter and return its leftmost digit.
// Eg. 1: input=285, output=2
// Eg. 2: input=76429, output=7
class LeftMostDigit 
{
 public int Count(int n)
 {
   while(n>9) n/=10;   
   return n;
  }
  public static void main(String[] args) {
    LeftMostDigit obj = new LeftMostDigit();
    System.out.println(obj.Count(285));
  }
}