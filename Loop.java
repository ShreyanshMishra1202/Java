import java.util.*;

class Loop{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s[]=new int[n];
            s[0]=a+b;
            for(int j=1;j<n;j++){
                    s[j]=s[j-1]+(int)(Math.pow(2,j) *b);
                    
                }
            for(int j=0;j<n;j++){
                System.out.print(s[j]+" ");
            }
                System.out.println();
            
        }
        
        in.close();
    }
}
