package com.company;
import java.util.Scanner;
public class A4_loops {
    public static void main(String[] args) {
      /*  System.out.println("while loop");
        int a=5;
        while (a>=1){
            System.out.println(a);
            a--;
        }

        System.out.println("do while loop");
        int b=1;
        do {
            System.out.println(b);
            b++;
        }
        while (b<=10);

        System.out.println("for loop");
        int n=10;
        for (int i=1; i<=n; i++){
            //System.out.println(2*i);
            System.out.println(2*i+1);

        }

        //question no:1
        for (int i=1; i<=5; i++){
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
            System.out.println();
        }
        //b
        for (int i=1; i<=5; i++){
            for (int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //question no:2
        int n=5;
        int even=1;
        while (even<=n){
            System.out.println(2*even);
            even++;
        }
        //b
        int sum=0;
        int n=3;
        for (int i=1; i<=n; i++){
            sum=sum+(2*i);
        }
        System.out.println("Sum of three even numbers is: "+sum);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter table");
        int tab=sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(tab+"X"+i+"="+tab*i);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter table");
        int tab=sc.nextInt();
        for (int i=10; i>=1; i--){
            System.out.println(tab+"X"+i+"="+tab*i);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter table");
        int tab=sc.nextInt();
        int i=10;
        while (i>=1){
            System.out.println(tab+"X"+i+"="+tab*i);
            i--;
        }
        //question no:3
        //what is factorial n= n*n-1*n-2*n-3.....
        //5! = 5*4*3*2*1
        int i=1;
        int fact=1;
        while (i<=5){
           fact*=i;
            i++;
        }
        System.out.println("factorial of 5 numbers are: "+fact);

        int factorial=1;
        for (int i=1; i<=5; i++){
            factorial*=i;
        }
        System.out.println(factorial);
        */
       //question no:4
        int sum=0;
        int tab=8;
        for (int i=1; i<=10; i++){
        sum+=tab*i;
        }
        System.out.println(sum);

    }
}
