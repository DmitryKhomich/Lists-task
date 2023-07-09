package task1;

import java.util.ArrayList;
import java.util.Collections;


public class Task1 {

    public static void main(String[] args) {
        printList(getInitialList());
        System.out.println();
        getSortedAndPrintedList(getInitialList());

    }

    static ArrayList<String> getInitialList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Alice");
        list.add("Robert");
        list.add("Lisa");
        list.add("David");
        list.add("Amanda");
        return list;
    }

    static void printList (ArrayList<String> list){
        System.out.println("Initial list: ");
        int count = 1;
        for(String l : list){
            System.out.println(count + ") ".concat(l));
            count++;
        }
    }

    static void getSortedAndPrintedList (ArrayList<String> list){
        Collections.sort(list);
        System.out.println("Sorted list: ");
        int count = 1;
        for(String l : list){
            System.out.println(count + ") ".concat(l));
            count++;
        }
    }
}
