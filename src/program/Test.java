package program;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No : ");
        int n=sc.nextInt();
        int fact=1;
        if(n>0)
        {
            for(int i=1;i<=n;i++)
                fact *= i;

            System.out.println("Factorial of "+n +" is = "+fact);
        }
        else
        {
            System.out.println("Invalid Input");
        }
}
}