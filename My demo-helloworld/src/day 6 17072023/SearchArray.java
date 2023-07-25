import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {

    char target = 'm';
    char[] chars = new char[] { 'j', 'p', 'm', 'm', 'q', 'c' };
    // Loop to find the index of the target in array chars
    // target--> employ if
    for (int i = 0; i < chars.length; ++i) {
      if (chars[i] == 'm') {
        System.out.println("index= " + i);
      }
    }
    // toCharArray() // inborn String method //Char x Array usual partner
    String str = "I am a boy."; // 11characters here
    char[] arr = str.toCharArray(); // length 11
    System.out.println(Arrays.toString(arr));
    // [I, , a,m, ,a, b,o,y, .]

    // Find Max.value in the array
    int[] nums = new int[] { 240, 800, -23, 800, 6, 3, 98 };
    int max = 0;
    //The above has an assumption. all -ve num above will be a bug.
    // ***for loop
    for (int i = 0; i < nums.length; i++) { //nums.length = 5
      // i=0, nums[0]-> 240
      if (nums[i] > max) {
        max = nums[i];
        System.out.println("The max value is " + max);
      }
    } //result: max = 800

    //Find Min. value in the array
    int[] nums2 = new int[] {240, 800,-23, 6, 98};
    int min = 9999999;
    for (int i = 0; i < nums2.length; ++i){  //for loop
      if (nums2[i] < min) {
        min = nums2[i];
      }
    } //result: min = -23 

  }
}
