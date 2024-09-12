import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={5,4,1,3,2};
        int l=a.length,k=0;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(a[j]>a[j+1]){
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
