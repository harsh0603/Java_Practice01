import java.util.*;
public class array_list {
public static void main(String[] args) {
    
    
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>();
    l1.add(6);
    l1.add(7);
    l1.add(4);
    l1.add(2);
    l1.add(2,45);

    l2.add(200);
    l2.add(300);
    l2.add(500);
    l2.add(800);

    l1.addAll(0,l2); //this is to add a new List
    // l1.clear();   //this is clear a list
    for(int i = 0;i<l1.size();i++){
        System.out.print(l1.get(i)+",");
    }
}

}
