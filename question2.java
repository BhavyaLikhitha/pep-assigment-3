import java.util.ArrayList;
import java.util.Collections;
 
public class CopyElementsOfArrayListToArrayListExample {
 
  public static void main(String[] args) {
    ArrayList arrayList1 = new ArrayList();
    arrayList1.add("1");
    arrayList1.add("2");
    arrayList1.add("3");
    ArrayList arrayList2 = new ArrayList();
    arrayList2.add("One");
    arrayList2.add("Two");
    arrayList2.add("Three");
    arrayList2.add("Four");
    arrayList2.add("Five");
    System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);
    System.out.println("After copy, Second ArrayList Contains : " + arrayList2);   
  }
}
