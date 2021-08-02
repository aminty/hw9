package part2;

import java.util.LinkedList;

public class MainApp {
    public static void main(String[] args) {

        ALinkedList<Integer> ls=new ALinkedList<>();
        ls.add(3);
        ls.add(4);
        ls.add(7);
        ls.add(2);
        System.out.println("Print: crunchifyList: \t\t" + ls);
        System.out.println(".size(): \t\t\t\t" + ls.size());

    }
}
