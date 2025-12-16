package chapter3;

//calculate the income tax paid by an employee to the government as per the slabs mentioned below:
public class Wage {
       public static void main(String[] args) {
       float income=2f;
       float tax=0.0f;
       
       if(income<2.5f){
           tax=tax+0;
       }
       else if(income>2.5f&&income<5.0f){
           tax=0.05f*(income-2.5f);
       }
       else if(income>5.0f&&income<10.0f){
             tax=0.05f*(5.0f-2.5f);
             tax=tax+0.20f*(income-5.0f);
       }
       else{
            tax=0.05f*(5.0f-2.5f);
             tax=tax+0.20f*(10.0f-5.0f);
             tax=tax+0.30f*(income-10.0f);
       }
       System.out.println(tax);
       }
}

// find the output of the following switch case statement
public static void main(String[] args) {
        int day=5;
        switch(day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("wednesday");
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
        }


    //leap or not leap year

   public static void main(String[] args) {
        int year=2000;
  if((year%4==0 && year%100!=0)|| yr%400==0){
            System.out.println("leap year");
        }
        else{
        System.out.println("not leap");
    }}
    
    //check whether the website is .com, .org or .in

     public static void main(String[] args) {
        String website="www.in";
        if(website.endsWith(".com")){
        System.out.println("commercial");
        }
        else if(website.endsWith(".edu")){
            System.out.println("education");
        }
        else if(website.endsWith(".in")){
            System.out.println("indian website");
        }
    }
