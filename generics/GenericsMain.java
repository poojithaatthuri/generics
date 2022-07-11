package generics;

public class GenericsMain {

    public static void main(String[] args) {
        System.out.println("Welcome1 to generics");
        //UC1 find maximum of three Integers
        //UC2 find maximum of three Integers
        GenericsMain genericClass = new GenericsMain();
        System.out.println("The Maximum Integer is : " + genericClass.testMaxium(1, 7, 4));
        System.out.println("The Maximum Float is : " + genericClass.testMaxium(1.3f, 4.5f, 7.7f));

    }

    String testMaxium(int v, int v1, int v2) {
        String o = null;
        return o;
    }

}


