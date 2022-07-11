package generics;

public class GenericsMain {
    public static void main(String[] args) {
System.out.println("Welcome1 to generics");
    //UC3 find maximum of three Integers,float and String
    GenericClass genericClass = new GenericClass();
        System.out.println("The Maximum Integer is : "+genericClass.testMaxium(1,7,4));
        System.out.println("The Maximum Float is : "+genericClass.testMaxium(1.3f,4.5f,7.7f));
        System.out.println("The Maximum String is : "+genericClass.testMaxium("apple","banana","peach"));
    //UC4 more than three values
    int in1 =4, in2 =6 , in3 =1, in4 =1;
    String s1="deer", s2="rino", s3="lion", s4 ="bear";
    GenericClass genericClass =new GenericClass();
        genericClass.testMaxium(in1,in2,in3,in4);
        genericClass.testMaxium(s1,s2,s3);
}
}