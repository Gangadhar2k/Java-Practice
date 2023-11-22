interface  School{
    public void study();
}
public class AnonymousClass {

    public static void main(String[] args) {
        School sc = new School() {
            @Override
            public void study() {
                System.out.println("It is a Ananymous Class Example");
            }
        };
        sc.study();  //It is a Ananymous Class Example
    }
}
