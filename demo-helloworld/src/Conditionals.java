public class Conditionals {

    public static void main(String[] args) {
        // if, else if, else
        int i = 18;
        if (i > 9) { // asking if i > 9, if yes, execute the block of the codes
            System.out.println("i=" + i); // i=18
        }
        // flow control; if then else
        if (i < 8) {
            System.out.println("i is smaller than 8");
        } else {
            System.out.println("i is larger than or equals to 8");
       }
       // else-if
       if (i >12) {
        System.out.println("i > 12");
        } else if (i <= 12 && i >= 0){
            System.out.println("i <= 12 and i >= 0") // executed
        }else{
        System.out.println("i is negative"); // not executed
        }
       int a = 2;
       int b = 5;
       int box = 8;
       if (a > b){
       box = 18;
    }else{
       box = 19;
int number = 11;
if (number % 2 == 1) {
    // do something here
    System.out.println("number is an odd number");
}
if (number % 2 == 0){ // checkingif number is an even number
    System.out.println("number is an even number");
}
    //String
    String str = ("Monday") 
    if (str..equals.("Monday")) {
        System.out.println("str = Monday");
            }
            if (str.charAt(4) == 'd') { //false
        System.out.println("yes");    
            }
    if str.length() > 10 
      System.out.println("lenght > 10");
    }
if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 18) {
    System.out.println("What is the result now?");
    }

    int score = 88;
    char grade = '';
    if (score >= 98) { //false
        grade = 'A'; // NOT executed
        } else if (score >= 88) { //true
        grade = 'B'; // executed}
        else if (score >= 78) { //checking? No
        grade = 'C'; // executed
        } else if (score >= 68) { //
        grade = 'D'; 
    } else {
       grade = "F";
       }
       // grade ?

        }

        int age = 65;
       // boolean isElderly = age >= 65; //true

        // if (age >= 65) {}
        if (isElderly) { // true or false  
            System.out.println("yes he is elderly");
        }
    // switch
    // Simple version
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) { //event
        case 1:
        dayName = "Monday";
        break; //exit
        case 2:
        dayName = "Tuesday";
        break; //exit
        case 3:
        dayName = "Wednesday";
        break; //exit
        case 4:
        dayName = "Thursday";
        case 5:
        dayName = "Friday";
        break; //exit
        case 6:
        dayName = "Saturday";
        break; //exit
        case 7:
        dayName = "Sunday";
        break; //exit

        System.out.println("dayName=" + dayName)
    }
}

}
