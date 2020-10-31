import java.util.*;
class Factorial
{
    public static void main(String [] args)
    {
        System.out.println("\t\tFactorial of a number");
        Scanner sc = new Scanner(System.in);
        int n,f,i;
        System.out.println("Enter the number");
        n =sc.nextInt();
        for(f=1,i=1;i<=n;i++)
            f=f*i;
        System.out.println("The factorial is -"+f);
    }
}