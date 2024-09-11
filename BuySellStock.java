import java.util.*;

public class BuySellStock {
    public static int max(int arr[]){
        int ma=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ma){
                ma=arr[i];
            }
        }
        return ma;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int ma;
        int m[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1)
            ma=max(Arrays.copyOfRange(arr,i+1,arr.length));
            else
            ma=arr[i];
            m[i]=ma-arr[i];
        }
        System.out.println(max(m));
    }
}
