public class BinarySearch{
    public static void main(String[] args) {
        int arr[]={1,3,5,9,13,22,45,78,99,112,123,156,189};
        int t=156;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>t){
                r=mid-1; 
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                System.out.println("Found at index "+mid);
                break;
            }
        }
        if(l>r){
            System.out.println("Not Found");
        }
    }
}