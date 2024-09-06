import java.lang.Math;public class dectobin {
    public static void main(String args[])
    {
        int n=20,re,st=0,w=0;
        while(n!=0){
            w=0;
            re=n%2;
            n/=2;
            while(re==0)
            {
                w++;
                re=n%2;
                n/=2;
            }
            re=re* (int)Math.pow(10,w);
            st=st*w+re;
            // st*=(int)Math.pow(10,w);
        }
        System.out.println(st);
    }
}