package Linked_List;

import java.util.LinkedList;

public class Linked_list {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        //Add-first/last
        list.addFirst("you");
        list.addLast("happy");
        list.addLast("collage");
        list.addFirst("Wish");
        list.add("daze");

        //print
        System.out.println(list);
        System.out.println(list.size());

        //remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove();
        System.out.println(list);

        //traverse and print
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
    }
}