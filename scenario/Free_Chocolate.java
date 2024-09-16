import java.util.*;
public class Free_Chocolate {
	public static int min(int arr[]){
		int u=Integer.MAX_VALUE;
		int o=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<u){
				u=arr[i];
				o=i;
			}

		}
		return o;
	}
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int v[]=new int[2];
		for(int i=0;i<2;i++){
			v[i]=sc.nextInt();
		}
		int n=v[0];
		int k=v[1];
		int y=(int)n/k;
		y=y+(n%k);
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int s=0;
		for(int i=0;i<y;i++){
			int q=min(arr);
			s+=arr[q];
			arr[q]=Integer.MAX_VALUE;
		}
		System.out.println(s);
    }
}