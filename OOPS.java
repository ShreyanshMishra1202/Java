package OOPS_JAVA;

public class OOPS {
    public static void main(String args[]){
        Pen p1=new Pen();// creates an Object or Constructor of class Pen
        p1.Setcolor("blue"); // it calls the function Setcolor which is in class Pen
        System.out.println(p1.color); // it prints value of color which is in class Pen
        p1.tip=45; // it directly updates the value of tip which is in class Pen
        System.out.println(p1.tip);
    }
}
// we should not write public class after class as it will be hard to call.
class Pen {
    String color;
    int tip;
    void Setcolor(String newcolor){
        color=newcolor;
    }
    void Settip(int newtip){
        tip=newtip;
    }
    
}
class student {
    String name;
    int age;
    float percentage;
    
    void calcpercent(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;
    }
    
}