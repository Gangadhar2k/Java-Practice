class Laptop{
    public void code(){
        System.out.println("in Laptop Coding");
    }
}
class Desktop extends Laptop{
    public void code(){
        System.out.println("in Desktop Coding");
    }
}
class Mobile extends Desktop{
    public void code(){
        System.out.println("in Mobile Coding");
    }
}
public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Laptop des ;
        des = new Laptop();
        des.code();             //in Laptop Coding
        des = new Desktop();
        des.code();             //in Desktop Coding
        des = new Mobile();
        des.code();             //in Mobile Coding
    }
}

