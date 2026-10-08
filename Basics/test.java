package Basics;
import java.util.*;

public class test {
    public static void main(String[]args){
    //    Scanner sc=new Scanner(System.in);
    //    System.out.print("Enter a number : ");
    //    int a= sc.nextInt();

    //    if(a%2==0){
    //     System.out.println("The number is even.");
    //    }
    //    else{
    //     System.out.println("The number is odd.");
    //    }


    Scanner age=new Scanner(System.in);
    System.out.print("Enter your age: ");
    int a=age.nextInt();

    if(a<18){
        System.out.println("Teenage");
    }
    else if(a>18 && a<35){
        System.out.println("Young");
    }

else{
    System.out.println("Adult");
}
    }
}
