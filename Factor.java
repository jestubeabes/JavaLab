import java.util.*;
class Factor
{
    public static void main(String [] args)
    {
        System.out.println("\t\tFactors of a Number");
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("The Factors of the number are -");
        for (i = 1; i <=n;i++) 
            if (n % i == 0) 
               System.out.println(i);
    }    
}