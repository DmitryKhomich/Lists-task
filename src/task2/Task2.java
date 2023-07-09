package task2;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        printInitialList(getListOfFruits());
        System.out.println();
        printRandomPartOfInitialList(getRandomPartList(getListOfFruits()));
    }

    static ArrayList<String> getListOfFruits(){
        ArrayList<String> list = new ArrayList<>();
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("cherry");
        return list;
    }

    static void printInitialList (ArrayList<String> list){
        System.out.println("Initial List: ");
        int count = 1;
        for(String l : list){
            System.out.println(count + ") " + l);
            count++;
        }
    }

    static ArrayList<String> getRandomPartList (ArrayList<String> list){
        ArrayList<String> partOfList = new ArrayList<>();
        partOfList.add(list.get((int) (Math.random() * list.size())));
        partOfList.add(list.get((int) (Math.random() * list.size())));
        return partOfList;
    }

    static void printRandomPartOfInitialList(ArrayList<String> list){
        int count = 1;
        System.out.println("List part: ");
        for(String s : list){
            System.out.println(count + ") " + s);
            count++;
        }
    }

}
