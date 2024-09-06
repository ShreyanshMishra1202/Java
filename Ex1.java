import java.util.*;
// import java.lang.Math;
public class Ex1 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        int p=0,di=2;
        System.out.println(p);
        for(int j=1;j<=6;j++)
        {
            p+=di;
            di+=8;
            System.out.println(p);
        }
        sc.close();
    }
}
