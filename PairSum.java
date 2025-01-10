import java.util.ArrayList;

//Fast Approach 

public class PairSum {
    public boolean check(ArrayList<Integer> al,int t){
        int b=-1;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)){
                b=i;
                break;
            }
        }

        int l=b+1,r=b;
        int n=al.size();
        while(l!=r){
            if(al.get(l)+al.get(r)==t){
                return true;
            }
            else if(al.get(l)+al.get(r)>t){
                r=(n+r-1)%n;
            }
            else{
                l=(l+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        int t=16;
        PairSum h=new PairSum();
        if(h.check(al,t)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
