class Iterating {
    public static void main(String[] args) {
        int[] nums = new int[201];
        for(i = 0; i < nums.length; i++) {
            nums[i] = i - nums.length/2;
            System.out.println(nums[i]);
        }
    }
}