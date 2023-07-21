import java.util.Arrays;
import java.util.Scanner;

public class testforquest9 {
  public static void main(String[] args) {
    
  }
  
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.print("Input a Index Position: ");
        int index = scanner.nextInt();
        System.out.print("Input a new Value: ");
        int value = scanner.nextInt();
        int[] newArr = insertElement(arr, index, value);
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
    
    public static int[] insertElement(int[] arr, int index, int value) {
        if (index == arr.length) {
            return arr;
        }
        
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
  
}
