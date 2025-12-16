package chapter3;

//guess the output of the following code
public class Conditions {
    public static void main(String[] args) {
        int a=10;
        if(a==11) {
            System.out.println("i am 11");
        }
        else {
            System.out.println("i am not 11");
        }
    }
}//output: i am not 11


//write a program to find whether a student is pass or fail;
 public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sub1=scan.nextDouble();
        double sub2=scan.nextDouble();
          double sub3=scan.nextDouble();
          
          double tot=(sub1+sub2+sub3)/300;
          double percentage=tot*100;
          System.out.println(percentage);
          
          if(percentage>=33){
               System.out.println("pass");
          }
          else{
              System.out.println("fail");
          }
    }

    
