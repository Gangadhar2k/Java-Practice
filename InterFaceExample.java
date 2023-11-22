interface Car{
    public void drive();
    public void park();

}
abstract class DrivingSchool implements Car{
    public void drive() {
        System.out.println("Im am in a Driving School Class Drive method");
    }

}

class DrivingSchool2 extends DrivingSchool{
    public void park(){
        System.out.println("Im am in a Driving School 2 Class Park method");
        }
}
public class InterFaceExample {

    public static void main(String[] args) {
        DrivingSchool2 Ds2 = new DrivingSchool2();
        Ds2.drive();                //Im am in a Driving School Class Drive method
        Ds2.park();                 //Im am in a Driving School 2 Class Park method

    }
}
