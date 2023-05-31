import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7,12,235,1425,234568};
        int target = 9;
        int[] result = {0, 1};

        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));

        int s = singleNumber(nums);
        System.out.println(s);

        int[] sum = runningSum(nums);
        System.out.println(Arrays.toString(sum));

        int count = findMaxConsecutiveOnes(nums);
        System.out.println(count);

        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        boolean check = isRectangleOverlap(rec1, rec2);
        System.out.println(check);

        int countTwo = majorityElement(nums);
        System.out.println(countTwo);

        System.out.println("Nhập n :");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] out = shuffle(nums,n);
        System.out.println(Arrays.toString(out));

        int summ = findNumbers(nums);
        System.out.println(summ);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return nums[i];
            }
        }
        return -1; // or throw an exception if no unique element is found
    }

    /* https://leetcode.com/problems/running-sum-of-1d-array/submissions/957161815/ */
    public static int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            out[i] = out[i - 1] + nums[i];
        }
        return out;
    }


    /* https://leetcode.com/problems/max-consecutive-ones/submissions/957178072/ */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    /* https://leetcode.com/problems/rectangle-overlap/submissions/957477357/ */
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }
        if (rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
            return false;
        }
        return true;
    }

    /* https://leetcode.com/problems/majority-element/submissions/957656201/ */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /* https://leetcode.com/problems/shuffle-the-array/submissions/957738701/ */
    public static int[] shuffle(int[] nums, int n) {
        int[] out = new int[2*n];
        int i=0,j;
        for(j=0; j<2*n; j+=2){
            out[j] = nums[i];
            out[j+1] = nums[i+n];
            i++;
        }
        return out;
    }

    public  static  int findNumbers(int[] nums) {
        int count =0;
        for (int n :nums
             ) {
            //            String str = Integer.toString(nums[i]);
            String str = n + "";
            int length = str.length();
            if (length%2==0){
                count++;
            }
        }
        return  count;
        }
}
