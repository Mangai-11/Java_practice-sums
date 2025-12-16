package chapter3;

// find the use of toLowerCase() and toUpperCase() methods of the String class
public class StringMethods 
{
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
}
}

// find the use of replace() method of the String class
public class StringMethods 
{
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(s.replace(" ", "_"));
      
}
}
// find the use of replace() method of the String class

     public static void main(String[] args) {
         String name="mangai";
        String letter="Dear,"+name+",Thanks a lot";
        System.out.println(letter.replace("mangai","aadhirai"));
}

//find double spaces in a string using indexOf() method of the String class

     public static void main(String[] args) {
       String s= "heiihello";
       System.out.println(s.indexOf("  ")); // returns -1 if not found
      
}
// find the use of escape sequence in a string

     public static void main(String[] args) {
       String letter= "Dear harry, \n\t Thanks for the java course !";
       System.out.println(letter);
      
}

