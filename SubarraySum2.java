import java.lang.Math;
public class SubarraySum2{
    public static int maxsubarray(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            ms=Math.max(ms, prefix[i]-cs);
            cs=Math.min(prefix[i],cs);
        }
        return ms;
    }
    public static void main(String args[]){
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxsubarray(arr));
    }
}