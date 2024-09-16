// import java.util.*;
public class ss{
    public static int check(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
            return i;// add return if want first occurence
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,3};
        int a=3;
        System.out.println(check(arr,a));
    }
}