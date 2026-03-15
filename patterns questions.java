// 1. to print  
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * *

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=0;i<=n;i++){
           for(int j=0;j<=n;j++){
               System.out.print("* ");
           }
        System.out.println();   
       }        
    }
}

// 2. to print
*
**
***
****
*****

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=0;i<=n;i++){
           for(int j=0;j<=i;j++){
               System.out.print("* ");
           }
        System.out.println();   
       }        
    }
}

// 3. to print
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j+" ");
           }
        System.out.println();   
       }        
    }
}

// 4. to print
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(i+" ");
           }
        System.out.println();   
       }        
    }
}

// 5. to print
* * * * 
* * * 
* * 
* 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
               System.out.print("* ");
           }
        System.out.println();   
       }        
    }
}

// 6. to print
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
               System.out.print(j+" ");
           }
        System.out.println();   
       }        
    }
}

//  7. to print
    *
   ***
  *****
 *******
*********

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
           //for space
           for(int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
           //for stars
           for(int j=0;j<2*i+1;j++){
               System.out.print("*");
           }

        System.out.println();   
       }        
    }
}

// 9. to print
*********
 *******
  *****
   ***
    *

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
           //for space
           for(int j=0;j<i;j++){
               System.out.print(" ");
           }
           //for stars
           for(int j=0;j<2*n-(2*i+1);j++){
               System.out.print("*");
           }

        System.out.println();   
       }        
    }
}
   // 10. to print
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
           
           //for up pyramid
           // for space
           for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
           }
           //for stars
           for (int j=0;j<2*i+1;j++){
                System.out.print("*");
           }
           System.out.println();
       }
        for(int i=0;i<n;i++){   
           // down pyramid
           //for space
           for(int j=0;j<i;j++){
               System.out.print(" ");
           }
           //for stars
           for(int j=0;j<2*n-(2*i+1);j++){
               System.out.print("*");
           }
        System.out.println();   
       }        
    }
}    

// to print

1
01
101
0101
10101

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                      System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
         System.out.println();
        }
    }
}



   
  
  
  
   
