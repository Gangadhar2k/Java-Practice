class Encap{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("hello iam "+name+" : "+age+" old");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap en = new Encap();
        en.setAge(21);
        en.setName("Gangadhar");

        System.out.println( en.getAge()); //21

        System.out.println( en.getName()); //Gangadhar

        en.display(); //hello iam Gangadhar : 21 old

    }
}
