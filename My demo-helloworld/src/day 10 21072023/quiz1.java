
public class quiz1 {
public static void main(String[] args) {
  //Q1
  int price = 150;
  int quantity = 10;
  int discount = 0.9; //should be double
  System.out.println(price*quantity*discount);

  //Q2
  byte hours = 24;
  byte days = 7;
  byte hoursOfweek = (byte) (hours*days);
  System.out.println(hoursOfweek);

  //Q3
  String str = "Welcome to programming";
  String newStr = str.replace("WELCOME TO", "");
  char c = newStr.trim().charAt(2);
  System.out.println(c);

  //Q4
  String str4 = "hello";
  String newStr4 = "";
  
  if (str.length()> 5 || str.indexOf("he") == 1){
    newStr4 = str4;
  }else{
    newStr4 += "str4";
  }
  System.out.println(newStr);

  //Q5
  String str5 = "";

  for (byte i = 127; i < 128; i++){
    str += i;
    if (i < 0){
      break;
    }
  }

  //Q6
  String str6 = "";
  
  for (byte i = 127; i < 128; i++){
        if (i < 0){
      continue;
    }
    str += i;
  }
  System.out.println(str);


  //Q7
  int[] integers = {20, 10, 40};
  byte[] bytes = new byte[] {2, 4, 1};
  int score = 0;

  for (int i = 0; i < 3; i++){
    if (i%2 == 1){ //odd number
      score += integers[i];
    }else{
      score += bytes[i];
    }
  }
  System.out.println(score);

       //Q8
     String[] strings = new String[3];
     String sum = "";

     for (int = 0; i < 4; i ++) {
      strings[i] = String.valueOf(i);
      sum += strings[i];
     }
     System.out.println(sum);

     //Q9
     int a = 0;
     while (a < 3){
      switch (a){
        case 0:
        System.out.print("0");
        case 2:
        System.out.print("2");
      }
      a++;
     }
   }
}
