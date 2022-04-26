class TaskEvenOdd{
public static void main(String args []){
java.util.Scanner sc = new java.util.Scanner(System.in);

      System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num+" is even number!");
        }
        else {
            System.out.println(num+" is odd number!");
        }
}
}