public class 2413a {
  public static void main(String[] args) {
    int lcm = nums[0];
    for (int i = 0; i < nums.length; i++) {
      lcm = getLCM(lcm, nums[i]);
    }
    if (lcm % 2 == 1){
      lcm *= 2;
    }
    retrun lcm;

    }
  }
