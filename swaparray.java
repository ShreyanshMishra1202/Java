import java.util.*;
public class swaparray {
	public static void swap(int arr[],int y){
		int temp;
		for(int i=y;i<arr.length-1;i++){
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int o=0;
		for(int i=0;i<n-o;i++){
			if(arr[i]==0){
				swap(arr,i);
				o++;i--;
			}
			
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
    }
}
