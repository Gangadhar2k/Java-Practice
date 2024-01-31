class Student{
    String name;
    int mark;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gangadhar";
        s1.mark = 79;

        Student s2 = new Student();
        s2.name = "Gangadhar";
        s2.mark = 79;

        Student s3 = new Student();
        s3.name = "Gangadhar";
        s3.mark = 79;



        Student[] stu = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].name+" : "+stu[i].mark);
        }


    }
}
