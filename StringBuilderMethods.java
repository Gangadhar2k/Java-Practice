import java.sql.SQLOutput;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World");

//        Append Method
           sb.append(" Java");
           System.out.println(sb);    //Hello, World Java

//        Inset Method
            sb.insert(5," Beautiful");
            System.out.println(sb);    //Hello Beautiful, World Java

//        Delete Method
            sb.delete(5,15);
            System.out.println(sb);   //Hello, World Java

//        SubString Method
            String subStr = sb.substring(7,12);
            System.out.println(subStr);  //World

//        Replace Method
            sb.replace(7,12,"Universe");
            System.out.println(sb); //Hello, Universe Java

//        Reverse Method
            sb.reverse();
            System.out.println(sb);  //avaJ esrevinU ,olleH
            sb.reverse();
            System.out.println(sb);  //Hello, Universe Java

//        CharAt Method
            char charAtIndex = sb.charAt(4);
            System.out.println(charAtIndex);  // o

//        capacity Method
            int sb_capacity = sb.capacity();
            System.out.println(sb_capacity);  //28

//        ensureCapacity Method    Setting minimum capacity
            sb.ensureCapacity(10);  // Ensures the capacity is at least 50 characters


//       Set Character to Index
              sb.setCharAt(7,'$');
              System.out.println(sb);//Hello, $niverse Java

//        Index Of String
           int str_index =  sb.indexOf("Java");
           System.out.println(str_index); //16

//        Last Index Of string Or Character
            int last_Index = sb.lastIndexOf("e");
            System.out.println(last_Index); //14

//        To string
            String toString  = sb.toString(); //Converting String Builder to string;

//       Delete Character At Index
          sb.deleteCharAt(4);
          System.out.println(sb); //Hell, $niverse Java

//        Length Method
            int sb_length = sb.length();
            System.out.println(sb_length); //19

    }
}
