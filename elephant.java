// import java.util.Scanner;
// public class elephant {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
       
//         int steps = n / 5; 
        
        
//         if (n % 5 != 0) {
//             steps++; 
//         }
        
//         System.out.println(steps);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class elephant {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int steps = 0;
//         while (n>0){
//             if (n>5){
//                 int z = n / 5;
//                 steps += z;
//                 n = n % 5;
//             }
//             else{
//                 steps += n;
//                 n = 0;
//             }
//         }
//         System.out.println(steps);
//     }
// }

// import java.util.Scanner;
// public class elephant {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int n = sc.nextInt();
//         int w = sc.nextInt();
       
    
//         int f = w*(w+1);
//         int t = f/2;
//         int remain = n - t;
//         System.out.println(remain);
    
//     }

// }

// import java.util.Scanner;

// public class elephant {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         long k = sc.nextLong();
//         long n = sc.nextLong();
//         long w = sc.nextLong();
       
     
//         long totalCost = k * (w * (w + 1) / 2);
        
       
//         if (totalCost > n) {
//             System.out.println(totalCost - n);
//         } else {
//             System.out.println(0);
//         }
//     }
// }
import java.util.Scanner;
public class elephant {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalMoney = 0;
        for (int i=1;i<=w;i++){
            totalMoney += k*i;
        }   
        if (totalMoney > n) {
            System.out.println(totalMoney - n);
        } else {
            System.out.println(0);
        }

    }
}