import java.util.*;
class Armstrong
{
    public static void main(String [] args)
    {
        System.out.println("\t\tArmstrong Number");
        Scanner sc = new Scanner(System.in);
        int a,s=0,x,n;
        System.out.println("Enter the number");
        n =sc.nextInt();
        a=n;  
        while(n>0)  
    {  
          x=n%10;  
          n=n/10;  
          s=s+(x*x*x);  
    } 
    if(a==s)
            System.out.println("The number is Armstrong");
        else
            System.out.println("The number is not Armstrong");
    }
}