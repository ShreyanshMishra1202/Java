import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(j<=i)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            if(i>=2)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=2;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(j<=i)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            if(i>=2)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
}
