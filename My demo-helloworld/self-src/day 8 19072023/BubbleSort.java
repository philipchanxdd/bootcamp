public class BubbleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // Step1.1: [1, 5, 4, 8, 2]  (swap 1,5)
    // Step1.2: [1, 4, 5, 8, 2]  (swap 4,5)
    // Step1.3: [1, 4, 5, 8, 2]  (no swap, due to 5 < 8)
    // Step1.4: [1, 4, 5, 2, 8]  (swap 2,8)
    // Step2.1: [1, 4, 5, 2, 8]  (no swap, due to 1 < 4)
    // Step2.2: [1, 4, 5, 8, 2]..(no swap, due to 4 < 5)
    // Step2.3: [1, 4, 5, 2, 8]  (the last element should be the largest)
    // ...
    // target: [1, 2, 4, 5, 8]
    int[] nums = new int[] {5, 1, 4, 8, 2};
  //    public  int[] sort(int[] arr) {}

  }

    public static int[] sort(int[] arr) {

    int temp;
    for (int i = 0; i < 2; ++i){
      for (int j = 0; j < arr.length - i - 1; ++j){
        if (arr[j] > arr[j + 1]){
         temp = arr[j];
         arr[j] = arr[j + 1];
         arr[j + 1] = temp;
        }
              
    }
      }
      //..
    }
  }

  
  


  
