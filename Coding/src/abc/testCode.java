package abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testCode {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList();
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    Iterator<Integer> iter = list.iterator();
    while (iter.hasNext()) {
      if (iter.next() == 2) {
        iter.remove();
      }
    }
    list.forEach(p -> System.out.println(p));
  }
}
