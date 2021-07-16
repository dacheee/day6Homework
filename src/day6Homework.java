import java.util.Scanner;

public class day6Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double time;
        double date, month, year;
        date = 16;
        month = 7;
        year = 2021;

//     If the value is smaller than 12,
//     then the greeting message “Good Morning Sunshine!” will be printed out in the console.
//
//     If the value is between 13 and 19,
//     then the greeting message “Good Afternoon. Work Hard!” will be printed out in the console.
//
//      If the value is between 20 and 24,
//      then the greeting message “Good Evening. Get some rest!” will be printed out in the console.


        System.out.println("What time is it?");
        System.out.println("Please use a ',' in between the numbers (for example : 12,28! Thank you!)");
        time = scanner.nextDouble();

        if (time < 13 ) {
            System.out.println("Good Morning Sunshine!");
        }
        if (time >= 13 && time <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
        }
        if (time >= 20 && time <= 24) {
            System.out.println("Good Evening. Get some rest!");
        }
//     Change the time variable value to 20 and look at the console.
//     Which greeting message is printed out in the console?
//
//     Change the time variable value to -2 and look at the console.
//     Please add correct verification in the code!
//
//     Change the time variable value to 100 and look at the console.
//     Please add correct verification in the code!
//
//     Verify if day, month and year are correct.
//     For example, day can not be -10, or month can not be 34, year can not be -2032.
//     If the variables are incorrect, please inform the user.
//     If all variables are in the correct range, please print out the date in the following format:
//
//     YYYY/MM/DD
//
//     NB! Error messages should be in English and are informative meaning -
//     should not interrupt execution of program.


        if (time >= 0 && time < 24) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("It is " + time + " " + "o'clock");
            System.out.println((int) year + " 0" + (int) month + " " + (int) date);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } else if (time < 0 || time > 24) {
            System.out.println("Please check the time and try again!");
        } else {
            System.out.println("Something is really wrong! Please check time and try again!");
        }


    }
}
