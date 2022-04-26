class TaskTwo{
public static void main(String args[]){
  java.util.Scanner sc= new java.util.Scanner(System.in);

System.out.println("Enter your name: ");
  String name=sc.nextLine();
System.out.println(name);
                  

        System.out.println("Marks of english:");
        int english=sc.nextInt();
        System.out.println("Marks of physics:");
        int physics=sc.nextInt();
        System.out.println("Marks of math:");
        int math=sc.nextInt();
        System.out.println("Marks of ICT");
        int ICT=sc.nextInt();
        System.out.println("Marks of programing:");
        int programing=sc.nextInt();
        int obtained_marks=english+physics+math+ICT+programing;
        float total_marks=500;
        float percentage=obtained_marks*100/total_marks;
        System.out.println("Your percentage is: "+percentage+"%");

              if (percentage>=90){
            System.out.println("your grade is: A+");
        }
        else if (percentage>=80){
            System.out.println("your grade is: A");
        }
        else if (percentage>=70){
            System.out.println("Your grade is: B");
        }
        else if (percentage>=60){
            System.out.println("Your grade is: C");
        }
        else if (percentage>=50){
            System.out.println("Your grade is: D");
        }
        else {
            System.out.println("fail");
        }
    }
}

