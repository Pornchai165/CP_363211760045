package Lab5;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("SAM");
        myList.add("NAT");
        myList.add("BOMB");
        System.out.println(myList);
        //remove
        myList.remove(1);
        System.out.println(myList);
        //insert at index 0
        myList.add(0, "Ann");
        System.out.println(myList);
    }
}