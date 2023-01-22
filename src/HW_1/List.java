package HW_1;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");
        list.add("String5");
        list.add("String6");
        list.add("String7");
        list.add("String8");
        list.add("String9");
        list.add("String10");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
