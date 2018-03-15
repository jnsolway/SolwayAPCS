import java.util.*;

class Lists {
    public static void main(String[] args) {
        // ArrayList<Integer> numList = new ArrayList<Integer>();

        // numList.add(5); // [5]
        // numList.add(0,10); // [10,5]
        // numList.add(1,15); // [10,15,5]
        // numList.remove(1); // [10,5]
        // numList.add(20); // [10,5,20]
        // numList.add(1,25); // [10,25,5,20]
        // numList.add(0, 30); // [30,10,25,5,20]
        // numList.add(3, 35); // [30,10,25,5,35,20]
        // numList.remove(2); // [30,10,5,35,20]

        ArrayList<String> todoList = new ArrayList<String>(); 
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        todoList.add(s);
        // System.out.println(todoList.get(0));
        for(int i = 0; i < todoList.size(); i++) {
            System.out.println("[" + i + "] " + todoList.get(i));
        }


    }   
}