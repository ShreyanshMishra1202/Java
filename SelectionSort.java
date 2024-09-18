import java.util.Arrays;

public class SelectionSort {
    public static int min(int arr[], int n) {
        int u=Integer.MAX_VALUE,o=0;
        for(int i=n;i<arr.length;i++){
            if(arr[i]<u){
                u=arr[i];
                o=i;
            }
        }
        return o;
    }
    
    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};
        int temp;
        for(int i=0;i<arr.length;i++){
            int y=min(arr,i);
            temp=arr[y];
            arr[y]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
