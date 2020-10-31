import java.util.*;
class NSum
{
    public static void main(String [] args)
    {
        System.out.println("\t\tSum of 'N' Natural Numbers");
        Scanner sc = new Scanner(System.in);
        int l,i,sn;
        System.out.println("Enter the limit");
        l=sc.nextInt();
        for(sn=0,i=1;i<=l;i++)
            sn=sn+i;
        System.out.println("Sum of first 'N' nalural numbers are= "+sn);
    }
}