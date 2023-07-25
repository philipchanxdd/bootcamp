public class Array4 {
  public static int[] addOne(int[] arr){
    int[] res = new int[arr.length];
    for (int i = 0; i< arr.length; i++){
      res[i] = arr[i] + 1;
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = new int[] (3, 4, 8); //int[] nums is object reference
    int[] result = addOne(nums); //[4,5,9]
 
     //call concat
     String a = "abc";
     String b = "def";
     String result = concat{a, b};
  }
}
