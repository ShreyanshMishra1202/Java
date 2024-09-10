import java.util.Arrays;

public class TrappingRainwater {
    public static void TR(int arr[]){
        int lm[]=new int[arr.length];
        int rm[]=new int[arr.length];
        lm[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lm[i]=Math.max(arr[i],lm[i-1]);
        }
        rm[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rm[i]=Math.max(arr[i],rm[i+1]);
        }
        System.out.println(Arrays.toString(lm));
        System.out.println(Arrays.toString(rm));
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s+(Math.min(lm[i],rm[i])-arr[i]);
        }
        System.out.println(s);
    }
    public static void main(String args[]){
        int arr[]={2,4,2,0,6,3,2,5};
        TR(arr);
    }
}
