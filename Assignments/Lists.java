import java.util.*;
    
class Lists {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
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
        
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print(ANSI_GREEN + "Enter an item in the To-do List: " + ANSI_RESET);
            scan = new Scanner(System.in);
            int x = -1;
            String s;
            if(scan.hasNextInt() ) { 
                x = scan.nextInt();
            } else {
                s = scan.nextLine();
                todoList.add(s);
            }
            if(x >= 0 && x < todoList.size()) {
                // System.out.println(x);
                todoList.remove(x);
                x = -1;
            }
            // System.out.println("Num: " + x);
            // System.out.println("Size: " + todoList.size());
            
            // System.out.println(todoList.get(0));
            System.out.println(ANSI_RED + "To-do" + ANSI_RESET);
            for(int i = 0; i < todoList.size(); i++) { 
                
                // System.out.println(todoList.size());
                System.out.println(ANSI_CYAN + "[" + i + "] " + ANSI_RESET + todoList.get(i)); 
            }
        

        }   
    }
}