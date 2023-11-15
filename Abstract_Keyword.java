abstract class Laptop_Ab{
    public abstract void coding();
    public abstract void Editing();
}
abstract class Desktop_Ab extends Laptop_Ab{
    public void coding(){
        System.out.println("Abstract Method coding");
    }
}

class Mobile_Ab extends Desktop_Ab{           //concrete  class
    public  void Editing(){
        System.out.println("Abstract method Editing");
    }
}
public class Abstract_Keyword {

    public static void main(String[] args) {

        Mobile_Ab com = new Mobile_Ab();
        com.Editing();          //Abstract method Editing
        com.coding();           //Abstract Method coding
    }
}
