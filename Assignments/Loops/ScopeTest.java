class ScopeTest {
        public static String message = "Hello";
        public static Boolean shouldLoop = false;

        public static void main(String args[]) {
            int i;
            while(i <= 10) {
                int n = i * 2;
                System.out.println(n);
                i++;
            }

            if(n > 10) {
                String message = "Hello World";
                System.out.println(message);
            }

            Boolean shouldLoop = true;
            int i = 0;
            while(shouldLoop) {
                if(i < 10) {
                    System.out.println(message);                    
                } else {
                    Boolean shouldLoop = false;
                }
                i++;
            }
        }
    }