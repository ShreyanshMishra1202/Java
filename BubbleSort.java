import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={5,4,1,3,2};
        // int a[]={1,2,3,4,5};
        int l=a.length,k=0;
        int swap=0;
        for(int i=0;i<l-i;i++){
            if(swap==0 && i!=0){
                break;
            }
            else{
                for(int j=0;j<l-1;j++){
                    if(a[j]>a[j+1]){
                        k=a[j];
                        a[j]=a[j+1];
                        a[j+1]=k;
                        swap++;
                    }
                }
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
}
