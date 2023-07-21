import java.util.Scanner;

public class revision3 {
  public static void main(String [] args){
    //if then else
 //   int mark = 92;
 //      System.out.println("Your mark is " + mark);
  //  if (mark < 50){
  //    System.out.println("Sorry! You failed the test");
   // }else{
   //   if (mark > 50){
   //     System.out.println("Congrats! You passed the test.");
   //   }
  //  }
  //  }


      int grade;
      //Scanner scn = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);//set up to read input
        //yellow:class,red:name,blue:method
        System.out.println("Please indicate your grade: ");
        grade = scn.nextInt();
         
         if(grade < 50){
          System.out.println("Failed");
         }else{
           if(grade < 80){
            System.out.println("Passed");
             }else{
               System.out.println("Excellent");
            }
        }


              int dayOfWeek;
         Scanner scn2 = new Scanner(System.in);//set up to read input
        System.out.println("Please indicate today of week: ");
       dayOfWeek = scn2.nextInt();
         
              switch (dayOfWeek) {
                  case 1:
                      System.out.println("Today is Monday");
                      break;
                  case 2:
                      System.out.println("Today is Tuesday");
                      break;
                  case 3:
                      System.out.println("Today is Wednesday");
                      break;
                  case 4:
                      System.out.println("Today is Thursday");
                      break;
                  case 5:
                      System.out.println("Today is Friday");
                      break;
                  case 6:
                      System.out.println("Today is Saturday");
                      break;
                  case 7:
                      System.out.println("Today is Sunday");
                      break;
                  default:
                      System.out.println("Invalid day of week");
                      break;
              }

              int MonthofYear;
              Scanner scn3 = new Scanner(System.in);
              System.out.println("Please indicate the month of this year: ");
              MonthofYear = scn3.nextInt();

              switch (MonthofYear);
                   Case 1a:
                   System.out.println("It's January");
                   Case 2a:
                      System.out.println("It's Feb");
                      break;
                  Case 3a:
                      System.out.println("It'Mar");
                      break;
                  Case 4:
                      System.out.println("It'Apr");
                      break;
                  Case 5:
                      System.out.println("It's May");
                      break;
                  Case 6:
                      System.out.println("It's Jun");
                      break;
                  Case 7:
                      System.out.println("Today is Sunday");
                      break;
                  Case 8:
                      System.out.println("Today is Sunday");
                      break;
                 Case 9:
                      System.out.println("Today is Sunday");
                      break;
                      Case 10:
                      System.out.println("Today is Sunday");
                      break;
                      Case 11:
                      System.out.println("Today is Sunday");
                      break;
                      Case 12:
                      System.out.println("Today is Sunday");
                      break;
                  default1:
                      System.out.println("Invalid Month of Year");
                      break;
          }
      }
