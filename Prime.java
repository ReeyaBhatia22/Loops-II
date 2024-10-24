import java.util.Scanner;
public class Prime
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int flag=0;
        for(int i=2;i<=t;i++) 
        {
            if(t%i==0)
            {
                System.out.println("It is not a prime number");
                flag=1;
                break;

            }
            
        
    }
    if(flag==0)
    {
        System.out.println("It is a prime number");
    }
}
}
