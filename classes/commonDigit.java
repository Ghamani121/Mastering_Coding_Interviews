class commonDigit 
{
  public int Sum(int n1, int n2)
  {
    int[] a1 = addToArray(n1);
    int[] a2 = addToArray(n2);
    int commonDigit = -1;

    for (int i = 9; i >= 0; i--) {
      if (a1[i] == 1 && a2[i] == 1) {
        commonDigit = i;
        break;
      }
    }

    return commonDigit;
  }

  public int[] addToArray(int n)
  {
    int[] a = new int[10];
    while (n > 0) {
      int rem = n % 10;
      a[rem] = 1;
      n /= 10;
    }
    return a;
  }
  public static void main(String[] args)
  {
    commonDigit obj = new commonDigit();
    System.out.println(obj.Sum(1267, 2567));
  }
}
