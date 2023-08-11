public class Foreachloop {
  public static void main(String[] args) {
    //Basic
    for(int i = 0; i < 3; i++){
      System.out.println("Hello");
    }
    //array is a data structure!!
    //For-each loop = ehanced for loop
    int[] arr = new int[] {1, 2, 3 ,4};
    // for (Type Element: dataset)
    //*the below cannot skip a part of elements
    //cannot compare
    for (int x : arr ){  //loop through all elements
      System.out.println("for-each: Hello, x= " + x);
      System.out.println(arr[0]); //but you still access element by index
      //modification
      arr[0] = 8;
    }
      //{1,4,10,13,20,0}
      //1,8
      //4,20
      //10,13
    for (int i = 0; i < arr.length; i++){ //[normal for loop] is counter
      System.out.println("for-each: hello");
      System.out.println("arr[0]" + arr[0]);
      arr[0] = 9;
    }


  //Another practice
  String[] strs= new String[] {"hello", "world"};

  for (String str : strs){
    System.out.println(str);
    Character[] chars = new Character[] {'L', 'a', '!', '{'};
    for (Character c : chars){
      System.out.println(c);
      //String is made of "single character"s
     
    }
  }
    }
}

