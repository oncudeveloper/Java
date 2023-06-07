package Array;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for(int i : nums){
            System.out.println(i);
        }

        System.out.println(nums.length);

        String[] names = {"Alice","Jason","Jack","Will"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        

    }
}
