class Parent_Calculator{
    public void Add(int a,int b){
        int c = a+b;
        System.out.println("Addition of "+a+" & "+b+" is "+ c);
    }
    public void sub(int a,int b){
        int c = a-b;
        System.out.println("Subraction of "+a+" & "+b+" is "+ c);
    }
}
class child_Calculator extends Parent_Calculator{
    public void multi(int a,int b){
        System.out.println("Multiplie of "+a+" & "+b+" is "+ a*b);
    }
    public void div(int a,int b){
        System.out.println("Division of "+a+" & "+b+" is "+ a/b);
    }
}

public class Single_Inheritance {

    public static void main(String[] args) {
        child_Calculator cc = new child_Calculator();

        cc.Add(2,4);    //Addition of 2 & 4 is 6
        cc.sub(4,6);    //Subraction of 4 & 6 is -2
        cc.multi(3,5);  //Multiplie of 3 & 5 is 15
        cc.div(6,4);    //Division of 6 & 4 is 1
    }
}
