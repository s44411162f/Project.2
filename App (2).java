package edu.uqu.cs;

/*
 * Lab 2
 * CS11211
 */

/*
* After the completion of this assignment, students should be able to: 
* Use the Scanner class and read integers from the user 
* Code arithmatic expressions and perform simple calculations
*/


import java.util.Scanner; 

/**
 * There is an issue with the class name.
 * For this exercise, you are not allowed to change the file name!
 * However, the filename should MATCH the class name!
 */
public class App {
  
    /**
     * This is the same lab exercise as 2.23 on Zybooks
     * @see {@linktourl https://learn.zybooks.com/zybook/UmmAl-QuraUniversityCS1211QadahWinter2023/chapter/2/section/23 }
     * Write a program using integers userNum and divNum as input, 
     * and output userNum divided by divNum three times. Note: End with a newline.
     * 
     * Ex: If the input is: 
     * 2000 2
     * the output is:
     * 1000 500 250
     * Note: In Java, integer division discards fractions. Ex: 6 / 4 is 1 (the 0.5 is discarded).
     */

    public static void part1(){
        Scanner scnr = new Scanner(System.in); 
        
        /* Write your code here */
        System.out.println("Enter userNum");
        int userNum = scnr.nextInt();

        System.out.println("Enter divNum");
        int divNum = scnr.nextInt();
        
        int res1 = userNum / divNum;

        int res2 = res1 / divNum;

        int res3 = res2 / divNum;

        System.out.println(res1 + " " + res2 + " " + res3);
        
    }
    /**
     * This is the same lab exercise as 2.24 on Zybooks
     * @see {@linktourl https://learn.zybooks.com/zybook/UmmAl-QuraUniversityCS1211QadahWinter2023/chapter/2/section/24 }
     * 
     * The following equation estimates the average calories burned for a person when exercising, 
     * which is based on a scientific journal article (@see {@linktourl https://www.tandfonline.com/doi/abs/10.1080/02640410470001730089}):
     * 
     * Calories = ( (Age x 0.2757) + (Weight x 0.03295) + (Heart Rate x 1.0781) — 75.4991 ) x Time / 8.368
     * 
     * Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Output the average calories burned for a person.
     * 
     * Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
     * System.out.printf("%.2f", yourValue);
     * Ex: If the input is:
     * 49 155 148 60
     * the output is:
     * Calories: 736.21 calories
     */

    public static void part2(){
        Scanner input1 = new Scanner(System.in);   

        /* Write your code here */
       System.out.println("Enter your Age: ");
        double Age = input1.nextDouble();

        System.out.println("Enter your Weight: ");
        double Weight = input1.nextDouble();

        System.out.println("Enter your HeartRate: ");
        double HeartRate = input1.nextDouble();

        System.out.println("Enter Time: ");
        double Time = input1.nextDouble();

        double Calories = ( (Age * 0.2757) + (Weight * 0.03295) + (HeartRate * 1.0781) - 75.4991 ) * Time / 8.368;

        System.out.println("Calories: " + Calories + " calories");
       
    }

    /*
     * main()
     *
     * Program execution begins with this method.
     */
     
    public static void main(String [] cargs) {
        /** 
         * The following lines will run the code that you have implmented above
         * Currently, they are commented-out. You can uncomment to enble running
         * Each part individually as you code.
         */

        part1();
        part2();

    }

}