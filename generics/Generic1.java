package generics;

import static java.lang.Math.max;

public class Generic1 {

    public class GenericsMain<T extends Comparable<T>> {
        public void testMaxium(T... n) {
            Integer i = 0;
            T max = n[i];
            for (T a : n) {
                if (n[i].compareTo(max) > 0)
                    max = n[i];
                i++;
            }
            PrintMax(max);
        }

        public void PrintMax(T max) {
            public <T > void PrintMax (T max){
                System.out.println("The maximum Value is : " + max);
            }
        }
    }
}
