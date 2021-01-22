package times;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int n=0;
        int[] nums=new int[]{2,3,4,5,5,6,6,6,7};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("输入想要的值");
        Scanner scanner=new Scanner(System.in);
        int target=scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]){
                n++;
            }
        }
        System.out.println(n);
    }
}
