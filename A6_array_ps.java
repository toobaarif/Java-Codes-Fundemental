package com.company;

public class A6_array_ps {
    public static void main(String[] args) {
        //question no:1
    /*    float [] marks={78.5f,98.5f,88.5f,65.5f,95.5f};
      float sum=0;
      for (float element: marks){
       sum=sum+element;
      }
        System.out.println("The value of sum is: "+sum);

      //question no:2
        int [] marks={34,55,66,77,88};
        int num=5;
        boolean inArray=false;
        for (int element: marks){
            if (num==element){
                inArray=true;
                break;
            }
        }
        if (inArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }

        //question no:3

     float [] marks={78.5f,98.5f,88.5f,65.5f,95.5f};
      float sum=0;
      for (float element: marks){
       sum=sum+element;
      }
        System.out.println("The average value of physics is: "+sum/ marks.length);
*/
        //question no:5
        int [][] mat1={{1,5,6},{2,4,5},{7,8,9}};
        int [][] mat2={{2,5,9},{5,8,0},{2,4,7}};
        int [][] result={{0,0,0},{0,0,0},{0,0,0}};
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                result[i][j]=mat1[i][j]*mat2[i][j];
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }
    }
}
