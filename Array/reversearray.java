import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        int start=0,end=a.length-1,mid,temp=end/2;
        while(start!=temp){
            mid=a[start];
            a[start]=a[end];
            a[end]=mid;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
