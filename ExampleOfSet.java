import java.util.HashSet;

public class ExampleOfSet {

    public static void main(String[] args) {

        /* 
        Set<Object> s1 = new HashSet<>();
        Set<Object> s2 = new LinkedHashSet<>();
        Set<Object> s3 = new TreeSet<>();
        */

        HashSet<Object> hs = new HashSet<>();

        hs.add(10);
        hs.add("Java");
        hs.add("Python");

        System.out.println(hs);

        System.out.println("-----------------------------------");

        System.out.println(hs.size());

        System.out.println("-----------------------------------");

        System.out.println(hs.isEmpty());

        System.out.println("-----------------------------------");

        System.out.println(hs.clone());

        System.out.println("-----------------------------------");

        for (Object obj : hs) {
            System.out.println(obj);
        }
    }
}
