class NewClass{

    private int age = 21;
    protected String name = "Gangadhar";

    private static int sage = 21;
    protected static String sname = "Gangadhar";
    class SubClass{
        public void Display(){
            System.out.println("I am in Sub Class my name is "+name +" and my age is "+age);
        }
        public int addFromInner(int a,int b){
            return a+b;
        }
    }

    static class StaticSubClass{
        public void DisplayFromStaicIc(){
//            it gives Error Bescause of using non-static variable in static class
//            System.out.println("I am in Static SubClass my name is "+name +" and my age is "+age);
        }

        public void DisplayFromStaicIcStaticVar(){
            System.out.println("I am in Static SubClass my name is "+sname +" and my age is "+sage);
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        NewClass nc = new NewClass();
//  ----------Nonstatic inner Class-------------------
        NewClass.SubClass sc = nc.new SubClass();
        sc.Display();                               //I am in Sub Class my name is Gangadhar and my age is 21
        int add = sc.addFromInner(10,3);      //13
        System.out.println(add);

//  --------------static Inner Class--------------------
        NewClass.StaticSubClass ssc = new NewClass.StaticSubClass();
        ssc.DisplayFromStaicIc();                // Error ==> java: non-static variable name cannot be referenced from a static context
        ssc.DisplayFromStaicIcStaticVar();      //I am in Static SubClass my name is Gangadhar and my age is 21

    }
}
