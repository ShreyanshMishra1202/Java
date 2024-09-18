import java.util.*;
public class Reverse_Vowel {
    public static void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] s=s1.toCharArray();
        int y=s.length-1;
        for(int i=0;i<s.length;i++){
            if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
                for(int j=y;j>=i;j--){
                    if(s[j]=='A'||s[j]=='E'||s[j]=='I'||s[j]=='O'||s[j]=='U'||s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'){
                        swap(s,i,j);
                        y=j-1;
                        break;
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(s));
        System.out.println("Answer: \n"+s1);
        String sd=new String(s);
        System.out.println(sd);
        System.out.println("end");
        
        sc.close();
    }
}
