public class NumberStats {

    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 9, 20, 15, 3};
        
        System.out.println("Number Stats Program");
        System.out.println("-------------------");
        
        System.out.print("Numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Maximum: " + max(numbers));
        System.out.println("Minimum: " + min(numbers));
    }

    public static int sum(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public static double average(int[] nums) {
        return (double) sum(nums) / nums.length;
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        return min;
    }
}

