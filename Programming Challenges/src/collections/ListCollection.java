package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollection {
    public static void main(String[] args){
        //creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();  // by default the size of the ArrayList will be 10

        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);

        List<String> strArray = Arrays.asList("Banana","Apple","Mango");
        ArrayList<String> array = new ArrayList<String>(strArray);

        System.out.println(array);

        //1. Adding elements
        list.add(9); // will be added at the last position
        System.out.println(list);

        list.add(2,5); // will be added to the specific index and rest will be shifted one position to their right
        System.out.println(list);

        //2. removing elements
        list.remove(3); // value of the index will be removed and the rest values will be shifted one position to the left
        System.out.println(list);

        array.remove("Apple");
        System.out.println(array);

        array.add("Orange");
        array.add("Pear");


        //3. accessing the element
        System.out.println(list.get(2));
        System.out.println(array);
        System.out.println(array.get(2));

        //4. modify the elements
        array.set(3,"Grapes");
        System.out.println(array);

        //5. checking if the array contains the element or not
        System.out.println(array.contains("Apple"));
        System.out.println(array.contains("Grapes"));

    }
}
