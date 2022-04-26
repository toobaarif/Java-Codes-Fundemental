package com.company;

import java.util.Scanner;

public class A1_percentageCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks of english");
        int english=sc.nextInt();
        System.out.println("Marks of physics");
        int physics=sc.nextInt();
        System.out.println("Marks of math");
        int math=sc.nextInt();
        System.out.println("Marks of ICT");
        int ICT=sc.nextInt();
        System.out.println("Marks of programing");
        int programing=sc.nextInt();
        int obtained_marks=english+physics+math+ICT+programing;
        float total_marks=500;
        float result=obtained_marks*100/total_marks;
        System.out.println("Your percentage is: "+result+"%");

        if (result>=90){
            System.out.println("your grade is: A+");
        }
        else if (result>=80){
            System.out.println("your percentage is: A");
        }
        else if (result>=70){
            System.out.println("Your grade is: B");
        }
        else if (result>=60){
            System.out.println("Your grade is: C");
        }
        else if (result>=50){
            System.out.println("Your grade is: D");
        }
        else {
            System.out.println("fail");
        }
    }
}
