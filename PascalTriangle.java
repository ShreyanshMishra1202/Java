public class PascalTriangle {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j))+" ");
            }
            System.out.println();
        }
    }
    public static int fact(int i){
        int d=1;
        for(int a=1;a<=i;a++){
            d=d*a;
        }
        return d;
    }
}
