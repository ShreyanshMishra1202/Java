// public class Main
// {
// 	public static void main(String[] args) {
// 		int ar[]={1,2,3,4,5};
// 		int s=0;
// 		for (int a:ar){
// 		    s=s+1;
// 		}
// 		System.out.println("Length = "+s);
// 	}
// }


public class Main
{
	public static void main(String[] args) {
		int ar[]={1,2,3,4,5};
		int so=0,se=0;
		for (int i=0;i<5;i++){
		    if(i%2==0){
		        so=so+ar[i];
		    }
		    else{
		        se=se+ar[i];
		    }
		}
		System.out.println("ODD SUM = "+so+"\nEVEN SUM = "+se);
	}
}