package min;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int[] nums=new int[]{1,9,3,5,4,2,8,7};
        System.out.println("当前数组为：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println("输入数字");
        Scanner scanner=new Scanner(System.in);

        int k=scanner.nextInt();
        int t;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }

        System.out.println("最小的"+k+"个数为：");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
