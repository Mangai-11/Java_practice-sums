package chapter1;
// Method 1- Write a program to check whether a given number is an integer or not.
  import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     double num=scan.nextDouble();
     if(num==Math.floor(num)){
        System.out.println(num +"is an integer");
    }
    else{
        System.out.println(num+"is not an integer");
    }
    scan.close();
}}

//Method 2
 double number = 10.5;
    if (number % 1 == 0) {
        System.out.println(number + " is an integer.");
    } else {
        System.out.println(number + " is not an integer.");
    } 

//Method 3 - If it is string input
 import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            Integer.parseInt(input);
            System.out.println(input + " is an integer.");
        } catch (NumberFormatException e) {
            System.out.println(input + " is not an integer.");
        }
        scanner.close();
    }

    

