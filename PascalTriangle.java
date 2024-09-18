import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static int fact(int i){
        int d=1;
        if(i==0){
            return d;
        }
        for(int a=1;a<=i;a++){
            d=d*a;
        }
        return d;
    }
}
