public class practice5 {
  public static void main(String[] args) {
    String str = "hello";
    char c1 = str.charAt(0); // Returns 'h'
    char c2 = str.charAt(2); // Returns 'l'
    System.out.println(c1); 
    //^I dont understand
 
    //Wrapper: Integer
    int [] nums = {3, 45, 76, 87, 23};

    Integer min = Integer.MAX_VALUE;
    //int abc = 1000
    //Integer.MAX_VALUE is the largest possible integer value
    Integer max = Integer.MIN_VALUE;
    //Integer.MIN_VALUE is the smallest possible integer value in Java.
     
     for (int i = 0; i < nums.length; i++){
        if (nums[i] < min){
           min = nums[i];
        }else if (nums[i] > max){
           max = nums[i];
        }
     }
     System.out.println("Min value: " + min);
     System.out.println("Max value: " + max);

     //When i = 0, nums[0] < 1000
     //min = nums[0] so that min = 3
     //When i = 1, nums[1] !< min -> nums[1] is not < 3
     //When i = 1, nums[]

     //Wrapper: Boolean
     boolean isboy = true;
     Boolean isgirl = true;

     isboy = false;
     if (isboy){
     }
     if (isgirl.compareTo(isboy) == 0){ 
       //asking if isFemale with the same value of isMale
 
     }
     isgirl = null; 

     System.out.println("Boolean value: " + isboy);
  }
}
