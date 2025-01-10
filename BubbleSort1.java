
import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args){
        int arr[]={45,22,89,90,12,4,87};
        for(int i=0;i<arr.length-1;i++){
            boolean n=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    n=false;
                }
            }
            if(n==true){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
