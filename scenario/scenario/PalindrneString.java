package scenario;

public class PalindrneString {
    public static String rev (String n) {
      
        String nstr="";
        char ch;
      
      for (int i=0; i<n.length(); i++)
      {
        ch= n.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      return nstr;
    }
    public static void main(String[] args) {
        String s,s1,s2;
        s="aaabbaaa";
        int k=(int)Math.ceil(s.length()/2);
        System.out.println(k);
        
        if(s.length()%2==1){
            s1=s.substring(0, k+1);
            s2=rev(s.substring(k,s.length()));
            if(s1.equals(s2)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not");
            }
        }
        else{
            s1=s.substring(0, k);
            s2=rev(s.substring(k,s.length()));
            if(s1.equals(s2)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not");
            }
        }
        System.out.println(s1+"\n"+s2);
    }
}
