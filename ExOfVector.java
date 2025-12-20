// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Iterator;
import java.util.Vector;

public class ExOfVector {
   public ExOfVector() {
   }

   public static void main(String[] var0) {
      Vector var1 = new Vector();
      var1.add(10);
      var1.add(30);
      var1.add(20);
      System.out.println(var1);
      System.out.println("-------------------------------------------");
      System.out.println(var1.get(2));
      System.out.println("----------------------------------");
      System.err.println(var1.isEmpty());
      System.out.println("----------------------------------");
      System.out.println(var1.contains(2));
      System.out.println("----------------------------------");
      System.out.println(var1.size());
      System.out.println("--------------------------------");
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Object var3 = var2.next();
         System.out.println(var3);
      }

   }
}

