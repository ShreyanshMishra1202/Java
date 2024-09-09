package Java;

public class SubarraySum {
    public static void sum(int a[]){
        int s;
        for(int p=0;p<a.length;p++){
            for(int i=p;i<a.length;i++){
                s=0;
                for (int j=i;j<a.length;j++){
                    s+=a[j];
                    System.out.print(a[j]+" ");
                }
                System.out.println("        SUM="+s);
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        sum(arr);
    }
}
