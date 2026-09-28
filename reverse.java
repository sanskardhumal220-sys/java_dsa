// import java.util.Scanner;
// public class reverse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev=0;
//         while(n>0){
//             int remainder = n%10;
//             rev=rev*10+remainder;
//             n=n/10;
//         }
//         System.out.println(rev);
    

//     }}

// import java.util.Scanner;
// public class reverse{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int original = n;
//         int rev=0;
//         while(n>0){
//             int remainder = n%10;
//             rev=rev*10+remainder;
//             n=n/10;
//         }
//         System.out.println(rev);
//     if(original==rev){
//         System.out.println("penlidrome");
//     }
//     else{
//         System.out.println("not penlidrome");
//     }
    

//     }}

// Question 1: Lucky Digit Counter

// Rohan enters a positive integer N. Count how many digits in the number are equal to 7.


// Input
// 274757

// Output
// 3



// import java.util.Scanner;

// public class Reverse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int count = 0;

//         do {
//             int remainder = n % 10;

//             if (remainder == 7) {
//                 count += 1;
//             }

//             n = n / 10;

//         } while (n > 0);

//         System.out.println(count);
//     }
// }

// Q2. Count Even and Odd Digits
// Problem
// Given a positive integer N, count how many even digits and odd digits are present in the number.


// Example

// Input
// 123456


// Output
// Even: 3
// Odd: 3
// import java.util.Scanner;

// public class reverse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int evencount=0;
//         int oddcount = 0;
//         do{
//             int remainder=n%10;
//             if(remainder%2==0){
//                evencount+=1;
//             }
            
//              else{
//                   oddcount+=1;
//             }
//             n=n/10;
//         }while(n>0);
//                 System.out.println("even : "+ evencount);
//                 System.out.println(oddcount);
            
//     }
// }

// Q3. Find the Largest Digit
// Problem
// Given a positive integer N, find the largest digit present in the number.


// Example

// Input
// 58329

// Output
// 9
import java.util.Scanner;
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = 0;
        do{
            int digit=n%10;
            if(largest<digit){
               largest=digit;
            }
            n=n/10;
        }while(n>0);
                System.out.println(largest);
               
    }
}