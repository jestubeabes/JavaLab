import java.util.*;
class Fibonacci
{
    public static void main(String [] args)
    {
        System.out.println("\t\tFibonacci Series");
        Scanner sc = new Scanner(System.in);
        int l,a,b,f;
        System.out.println("Enter the limit");
        l =sc.nextInt();
        System.out.println("Fibonacci Series upto given the limit-");
        for (a=0,b=0,f=1; b <= l; f=a+b)
        {   
             System.out.print(" "+b);    
             a=b;    
             b=f; 
        }
    }
}
    