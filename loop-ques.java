// to print no. from 1 to 10.
class Main {
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}


// to print no. from 10 to 1.
class Main {
    public static void main(String[] args) {
       
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}


// to print no. from 1 to N
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}

// find even no. from 1 to 20.
class Main {
    public static void main(String[] args) {
       
        for (int i=1;i<=20;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

// find even no. from 1 to 20.
class Main {
    public static void main(String[] args) {
      
        for (int i=1;i<=20;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}


// to print sum of n numbers ( used mathematical formula so logically wrong)

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
                System.out.println((i*(i+1))/2);
        }
    }
}


// to print sum of n numbers ( logic is correct but the print statement is used inside the loop which will result in printing every iterartion)

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       int sum=0;
       for (int i=1;i<=n;i++){
          sum=sum+i;
        System.out.println(sum);
       }
    }
}

// to print sum of n numbers ( correct version)

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

// to find the factorial of any no.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       int sum=1;
       
       if (n==0){
           System.out.println("1");
        }
        else if(n<0){
           System.out.println("invalid input");
        }
       else{
            for (int i=1;i<=n;i++){
                sum=sum*i;
           }
        System.out.println(sum);
        }
    }
}

//count no. of digits

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
        int count=0;
       
       if(n==0){
           count=1;
       }
       
       while(n!=0){
           n=n/10;
           count++;
       }
       System.out.print(count);
    }
}

// reverse a no.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       int rev=0;
       while(n!=0){
           int digit=n%10;
           rev=rev*10+digit;
           n=n/10;
       }
       System.out.print(rev);
    }
}

// to find if it's palindrome no.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no.");
       int n=sc.nextInt();
       
       int original=n;
       int rev=0;
       while(n!=0){
           int digit=n%10; 
            rev=rev*10+digit; 
            n=n/10;
        }
        if(original==rev){
           System.out.println("the number is palindrome"); 
        }
        else{ 
            System.out.println("the number is not palindrome");
        }
    }
}
   
