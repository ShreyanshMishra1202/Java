public class b1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            if(i%2==1)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2==1)
                    System.out.print(1);
                    else
                    System.out.print(0);
                }
            }
            else{
                for(int j=1;j<=i;j++)
                {
                    if(j%2==0)
                    System.out.print(1);
                    else
                    System.out.print(0);
                }
            }System.out.println();
        }
        
    }
}
// 1
// 01
// 101
// 0101
// 10101