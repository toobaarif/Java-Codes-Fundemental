package com.company;
import java.util.Scanner;
public class A3_stringss {
    public static void main(String[] args) {
     /*  String name="Tooba";
        System.out.print("\nMy name is tooba");
        System.out.println("my name: \t tooba");
        System.out.println("tooba \"");
        System.out.println("tooba \\");
        System.out.println("Tooba \f");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age =sc.nextInt();
        if (age<=18){
            System.out.println("you are an adult");
        }
        else if (age<=23){
            System.out.println("You get a job");
        }
        else if (age<=60){
            System.out.println("your are get retiered");
        }
        else {
            System.out.println("enjoy your life");
        }

           int a=20;
           int b=33;
        System.out.println(a<b && a>b);
        System.out.println(a<b || a>b);

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        switch (age){
            case 23:
                System.out.println(2*2);
                break;
            case 30:
                System.out.println(2*3);
                break;
            case 40:
                System.out.println(2*4);
                break;
            default:
                System.out.println(2*5);
        }


        char a='s';
        switch (a){
            case 'T':
                System.out.println("This is tooba");
                break;
            case 'l':
                System.out.println("This is laiba");
                break;
            case 'm':
                System.out.println("This is marwa");
                break;
            default:
                System.out.println("Error");
        }*/

        //question no: 1
        /*   int a=10;
           if (a==11){
               System.out.println("I am ten");
           }
           else {
               System.out.println("I am 11");
           }
           //question no: 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your math: ");
        int math=sc.nextInt();
        System.out.println("Enter your physics: ");
        int physics=sc.nextInt();
        System.out.println("Enter your english: ");
        int english=sc.nextInt();
        float avg=(physics+math+english)/3.0f;
        System.out.println("Avarage; "+avg);
        if (avg>=40 && math>=33 && physics>=33 && english>=33){
            System.out.println("Congratulation! you are pass");
        }else {
            System.out.println("Oops! you are fail");
        }
        //question no: 3
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day number");
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("It is monday");
                break;
            case 2:
                System.out.println("It is tuesday");
                break;
            case 3:
                System.out.println("It is wednesday");
                break;
            case 4:
                System.out.println("It is thursday");
                break;
            case 5:
                System.out.println("It is friday");
                break;
            case 6:
                System.out.println("It is saturday");
                break;
            case 7:
                System.out.println("It ia sunday");
        }*/
        // question no: 4
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website name");
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("organization website");
        }
        else if (website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if (website.endsWith(".pk")){
            System.out.println("Pakistani website");
        }
        else {
            System.out.println("No website");
        }

    }
}
