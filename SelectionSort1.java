
import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int arr[]={13,56,5,67,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
