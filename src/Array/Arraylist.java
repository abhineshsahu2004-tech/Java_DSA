package Array;

import java.util.ArrayList;

public class Arraylist {
    static void main(String[] args) {

            // Create Arraylist
            ArrayList<Integer> list=new ArrayList<>();

            // Add element
            list.add(5);
            list.add(8);

            // Adding element at particular index
            list.add(2 ,54 );
            list.add(3 , 55);

            //Replace
            list.set( 2, 44);

            //remove at particular index
            list.remove(3);

            //Remove element
            list.remove(Integer.valueOf(44));

            //Print a particular element
            System.out.println(list.get(1));

            //Print list
            System.out.println(list);
    }
}
