package task3;
import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        printInitialList(getInitialList());
        System.out.println();
        printEditedList(addNewMembersToInitialList(getInitialList()));
    }

    static List<String> getInitialList(){
        List<String> list = new LinkedList<>();
        list.add("orange");
        list.add("grape");
        list.add("apple");
        list.add("lemon");
        return list;
    }

    static void printInitialList (List<String> list){
        int count = 1;
        System.out.println("Initial list: ");
        for(String l : list){
            System.out.println(count + ") " + l);
            count++;
        }
    }

    static List<String> addNewMembersToInitialList (List<String> list){
        list.add(0, "plum");
        list.add(list.size(), "mango");
        return list;
    }

    static void printEditedList (List<String> list){
        int count = 1;
        System.out.println("Edited list: ");
        for(String l : list){
            System.out.println(count + ") " + l);
            count++;
        }
    }
}
