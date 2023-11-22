interface Calculator{
    public void operate (int a,int b);

}
public class LamdaExpression {

    public static void main(String[] args) {
        Calculator add = (a, b) -> System.out.println("Addition " + (a + b));
        Calculator sub = (a, b) -> System.out.println("Subtraction " + (a - b));
        Calculator mul = (a, b) -> System.out.println("Multiplication " + (a + b));
        Calculator div = (a, b) -> System.out.println("Division " + (a + b));


        add.operate(2, 5);          //Addition 7
        sub.operate(5, 7);          //Subtraction -2
        mul.operate(6, 9);          //Multiplication 15
        div.operate(4, 6);          //Division 10
    }
}
