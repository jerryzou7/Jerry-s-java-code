public class Selectionsort {
  public static void main(String[] args) {
      int[] nums = {15, 30, 85, 25, 40, 90, 50, 65, 20, 60};

      System.out.println("Before sorting:");
      printNums(nums);

     
      for (int first = 0; first < nums.length - 1; first++) {
          int least = first;
          for (int current = first + 1; current < nums.length; current++) {
              if (nums[current] < nums[least]) {
                  least = current;
              }
          }

          
          int temp = nums[least];
          nums[least] = nums[first];
          nums[first] = temp;
      }

      System.out.println("After sorting:");
      printNums(nums);
  }

  public static void printNums(int[] nums) {
      for (int num : nums) {
          System.out.println(num);
      }
      System.out.println("========");
  }
}

