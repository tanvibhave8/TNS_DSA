package Basics;
import java.util.*;

public class loops {
public static void main(String[]args){
    /*
-----FOR loop-----
for(initialization,condition,increment)
for(int a;a<20;a++){}
*/

// Scanner table=new Scanner(System.in);
// System.out.print("Enter a number");
// int a=table.nextInt();

// for(int i=1;i<=10;i++){
//     System.out.println(a + "x" + i + "=" + a*i);
// }


// Scanner sum=new Scanner(System.in);
// System.out.println("Enter the first number: ");
// int a=sum.nextInt();

// System.out.println("Enter the second number: ");
// int b=sum.nextInt();

// int c=a+b;
// System.out.println("The sum of two numbers is " + (float)c);


// Scanner temp=new Scanner(System.in);
// System.out.println("Enter the temperature in farenhite :");
// float far=temp.nextInt();

// float cel=(far-32)*5/9;
// System.out.println("The give temperature in celcius will be "+ cel);


// Scanner month=new Scanner(System.in);
// System.out.print("Enter the number of month :");
// int a=month.nextInt();

// switch (a) {
//     case 1:System.out.println("January");
//         break;
//     case 2:System.out.println("February");
//         break;
//     case 3:System.out.println("March");
//         break;
//     case 4:System.out.println("April");
//         break;
//     case 5:System.out.println("May");
//         break;
//     case 6:System.out.println("June");
//         break;
//     case 7:System.out.println("July");
//         break;
//     case 8:System.out.println("August");
//         break;
//     case 9:System.out.println("September");
//         break;
//     case 10:System.out.println("October");
//         break;
//     case 11:System.out.println("November");
//         break;
//     case 12:System.out.println("December");
//         break;
//     default:
//         System.out.println("Enter a valid number.");
//         break;
// }

/* 
    -----WHILE loop-----
*/ 

// Scanner nums=new Scanner(System.in);
// System.out.println("Enter the first number: ");
// int a=nums.nextInt();
// System.out.println("Enter the second number: ");
// int b=nums.nextInt();

// Scanner op=new Scanner(System.in);
// System.out.println("Enter 1 to add , 2 to substract, 3 to multiply , 4 to divide.");
// System.out.println("Enter your choice :");
// int num=op.nextInt();

// int add=a+b;
// int sub=a-b;
// int mul=a*b;
// int div=a%b;

// switch (num) {
//     case 1:
//         System.out.println("Addition of a & b is "+ add);
//         break;
//     case 2:
//         System.out.println("Difference of a & b is" + sub);
//         break;
//     case 3:
//         System.out.println("Product of a & b is" + mul);
//         break;
//     case 4:
//         System.out.println("Division of a & b is" + div);
//         break;
//     default:
//         System.out.println("Invalid input.");
        
// }

// Scanner sec=new Scanner(System.in);
// System.out.print("Enter the number of seconds:");

// long total_seconds=sec.nextLong();
// long hours=total_seconds/3600;
// long remaining_seconds=total_seconds%3600;
// long minutes=remaining_seconds/60;
// long seconds=remaining_seconds%60;

// System.out.println(hours+"hours"+minutes+"minutes"+seconds+"seconds");



// Scanner sc=new Scanner(System.in);
// System.out.print("Enter first number :");
// int a=sc.nextInt();

// System.out.print("Enter second number :");
// int b=sc.nextInt();

// System.out.print("Enter third number :");
// int c=sc.nextInt();

// if(a>b && a>c){
//     System.out.print("The largest number is"+ a);
// }

// else if(b>a && b>c){
//     System.out.print("The largest number is "+b);
// }

// else{ 
//     System.out.print("The largest number is "+c);
// }

// Scanner year=new Scanner(System.in);
// System.out.println("Enter a year :");
// int y=year.nextInt();

// if (y%4==0)
//     if(y%100!=0)
//         if(y%400==0){
//             System.out.println("Leap Year.");
//         }
//         else{
//         System.out.println("Not a Leap Year.");
//     }
//     else{
//         System.out.println("Not a Leap Year.");
//     }
// else{
//         System.out.println("Not a Leap Year.");
//     }

// if((y%4==0 && y%100!=0 )|| y%400==0){
//     System.out.println("Leap Year.");
// }
// else{
//     System.out.println("Not a Leap Year.");
// }


// for (int i=1; i<=5;i++){
//     for(int j=1;j<=5;j++){
//        System.out.print(" * ");
// }

// System.out.println();
// }


// for (int i=1; i<=4;i++){
//     for (int j=1;j<=i;j++){
//     System.out.print(" * ");
//     }
// System.out.println();
// }

// for (int i=1; i<=5;i++){
//     for(int j=1;j<=5;j++){
//         if(i==1 || i==5 || j==1 || j==5){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }

// }
// System.out.println();
// }

// for (int i=5; i>=1;i--){
//     for(int j=1;j<=i;j++){
//        System.out.print("*");
//     }
//     System.out.println();
// }


        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if ((i+j)%2==0){
    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
    //     }System.out.println();
    // }


    Scanner sc=new Scanner(System.in);
    System.out.println("Type 1 for triangle, 2 for square, 3 for rectangle.");
    System.out.println("Enter the shape of which area you want :");
    int a=sc.nextInt();

    // Scanner area=new Scanner(System.in);
    // System.out.println("Enter the side of shape :");
    // int b=area.nextInt();
     
   Scanner length=new Scanner(System.in);
   System.out.print("Enter the length of shape :");
   int l=length.nextInt();

   Scanner breadth=new Scanner(System.in);
   System.out.print("Enter the breadth of shape :");
   int w=breadth.nextInt();
    switch (a) {
        case 1:
            System.out.println("Area of Triangle is "+ ((0.5)*l*w));
            break;
        case 2:
            System.out.println("Area of Square is "+ l*l);
            break;
        case 3:
            System.out.println("Area of Rectangle is "+ l*w);
            break;
        default:
            break;
    }
    }
}



