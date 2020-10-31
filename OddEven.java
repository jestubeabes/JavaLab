import java.util.*;
class OddEven
{
    public static void main(String [] args)
    {
        System.out.println("\t\tOdd or Even Checking");
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}