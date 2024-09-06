import java.util.Arrays;

public class binarysearcharray {
    public static void main(String args[]){
        int a[]={1,2,6,3,5,8,4,0,12,65};
        int l=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>l)
            l=a[i];
        }
        System.out.println("Largest :- "+l);
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int key=8;
        int start=0,end=a.length-1,mid;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==key)
            {System.out.println("found at index "+mid);
            break;}
            else if(a[mid]<key)
            start=mid+1;
            else
            end=mid-1;
        }
    }
}
