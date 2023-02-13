import java.util.*;

/* 
public class App{
     public static void main(String[] args) {
          //output
          System.out.println("*");
          System.out.println("**"); 
          System.out.println("***"); 
          System.out.println("****");      
    }
}*/
/* 
class App {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
               int a = sc.nextInt();
               int b = sc.nextInt();
   
               int sum = a + b ;
               System.out.println(sum);
          }
     
}*/
/*
class App {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first no. = ");
          int a = sc.nextInt();
          System.out.println("Enter the second no. = ");
          int b = sc.nextInt();
          int sum = a + b ;
          int product = a * b ;
          System.out.println("The Sum of No.s is "+sum+"\nThe product of no.s is "+product);

     }
}*/
/*
class App {
     public static void main (String[] args){
          Scanner sc = new Scanner(System.in);
          double a = sc.nextDouble();
          double b = sc.nextDouble();
          double area = a * b ;
          System.out.println((int)area);
     }
}*/
/* 
class App {
     public static void main (String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter a name ");
          String a = sc.next();
          System.out.println("enter your age ");
          int b = sc.nextInt();
          System.out.println("enter your interst ");
          String c = sc.next();
          System.out.println("my name is "+a+" and my age is "+b+" and my field of intrest is in "+c);
     }
}*/
/* 
class App {
     public static void main(String[] args ){
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          System.out.println("area "+(a*a)+ "\nperimeter "+ (4*a));
     }
}*/
/* 
class App {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int a = 2;
          System.out.println("square of 2 is  "+(a*a));
     }
}
*/
/* 
class App {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
               String a = sc.next();
               String b = sc.next();
               System.out.println(a+b);
     }

}
*/
/* 
class App {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter thhe first no. ");
          int a = sc.nextInt();
          System.out.println("enter the second no. ");
          int b = sc.nextInt();
          System.out.println("enter the third no. ");
          int c = sc.nextInt();
          System.out.println("All are equal  "+(a==b&&b==c&&c==a));
          System.out.println("any two are equal "+(a==b||b==c||c==a));
     }
}     */
/*
class App {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter a first no. ");
          int a = sc.nextInt();
          System.out.println("enter a second no. ");
          int b = sc.nextInt();
          System.out.println(a<50);
          System.out.println(a<b);
     }
} */    
class App {
     public static void main(String[] args){
          try (Scanner sc = new Scanner(System.in)) {
               System.out.println("please enter robert exam marks of three subject ");
               System.out.println("enter first sub marks ");
               float a = sc.nextInt();
               System.out.println("enter second sub marks ");
               float b = sc.nextInt();
               System.out.println("enter third sub marks ");
               float c = sc.nextInt();
               float scored = a+b+c;
               float total = 300;
               System.out.println ("total marks "+scored +"\npercentage "+(scored/total)*100);
          }


     }

}

