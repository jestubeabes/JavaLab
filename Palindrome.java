import java.util.*;
class Palindrome
{
    public static void main(String [] args)
    {
        System.out.println("\t\tPalindrome Number");
        Scanner sc = new Scanner(System.in);
        int n,rev=0,x,m;
        System.out.println("Enter the number");
        n =sc.nextInt();
        m=n;
        while(n>0)
        {
         x=n%10; 
         rev=rev*10+x;    
         n=n/10; 
        }
        if(rev==m)
            System.out.println("The number is Pallindrome");
        else
            System.out.println("The number is not Pallindrome");
    }
}