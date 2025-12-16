package chapter1;


// Write a program to convert distance from kilometers to miles, meters, and centimeters.
  
  public class DistanceConverter {
  public static void main(String[] args) {
    double kilometers = 5.0;
    double miles = kilometers * 0.621371;
    double meters = kilometers * 1000;
    double centimeters = kilometers * 100000;

    System.out.println("Miles: " + miles);
    System.out.println("Meters: " + meters);
    System.out.println("Centimeters: " + centimeters);
    
  }
}  

