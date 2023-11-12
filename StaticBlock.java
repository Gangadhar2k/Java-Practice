public class StaticBlock {
    static  int age ;
    String name;
    int mark;
    static {
        age= 20;
        System.out.println("one");
    }

//    if we use Constructor it load every time when object created
//  public StaticBlock(){
//      age = 40;
//       System.out.println("construct");
//    }

    public  void display (String name,int mark){
        System.out.println("name : "+name+", Mark : "+mark+", Age : "+age);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.display("Gangadhar",78);

        StaticBlock sb1 = new StaticBlock();
        sb1.display("Aravind",78);
    }
}

//while using Static Block Output
//one
//name : Gangadhar, Mark : 78, Age : 20
//name : Aravind, Mark : 78, Age : 20


//while using Constructor output
//construct
//name : Gangadhar, Mark : 78, Age : 40
//construct
//name : Aravind, Mark : 78, Age : 40