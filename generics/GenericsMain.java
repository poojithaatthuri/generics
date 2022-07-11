package generics;

public class GenericsMain {

    public static void main(String[] args) {
        System.out.println("Welcome1 to generics");
        //UC1 find maximum of three Integers
        GenericsMain genericClass = new GenericsMain();
        Integer printValue = genericClass.testMaxium(1, 7, 4);
        System.out.println("The Maximum integer is : " + printValue);
    }

    private Integer testMaxium(int i, int i1, int i2) {
        return null;
    }
}


