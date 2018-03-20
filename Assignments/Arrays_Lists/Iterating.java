class Iterating {
    public static void main(String[] args) {
        int[] nums = new int[201];
        int[] fibonnaci = new int[40];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = i - nums.length/2;
            // System.out.println(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0){
                System.out.println(nums[i]*-1);
            } else {
                System.out.println(nums[i]);
            }
        }
        System.out.println("\n");
       
        // fibonnaci[1] = 1;
        // System.out.println(fibonnaci[0]);
        // System.out.println(fibonnaci[1]);
        for(int i = 0; i < fibonnaci.length; i++) {
            if(i < 2) {
                fibonnaci[i] = i;   
            }
            if(i >= 2) {
                fibonnaci[i] = fibonnaci[i-2] + fibonnaci[i-1];
            }
            System.out.println(fibonnaci[i]);
        }
    }
}