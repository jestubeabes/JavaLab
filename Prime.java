import java.util.*;
class Prime
{
    public static void main(String [] args)
    {
        System.out.println("\t\tPrime Number Checking");
        Scanner sc = new Scanner(System.in);
        int n,x,y;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(x=1,y=0;x<=n;x++)
            if(n%x==0)
               y=y+1;
        if(n==1)    
           System.out.println("It is neither Prime nor Composite Number");
        else
        {
          if(y==2)
            System.out.println("It is a Prime Number");
          else
            System.out.println("It is not a Prime Number");
        }   
        
    }
}
