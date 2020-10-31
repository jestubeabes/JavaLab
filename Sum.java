import java.util.*;
class Sum
{
    public static void main(String [] args)
    {
        System.out.println("\t\tSum of Two Numbers");
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number -");
        x =sc.nextInt();
        System.out.println("Enter the second number -");
        y = sc.nextInt();
        z =x+y;
        System.out.println("The sum of two numbers ="+z);
    }
}