
package ime;
public class Ime {
    public static void main(String[] args) {
       int n=5, i, j, space = 1;
       
     space = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
        System.out.println("");
        
        
      int rows=8;
       for (int x= rows; x>= 1; x--)
    {
    for (int y=rows; j>y;j--)
    {
    System.out.print(" ");
    }
    for (int k=1;k<=x;k++)
    {
    System.out.print("*");
    }
    System.out.println("");
    }
    }
    }
    

