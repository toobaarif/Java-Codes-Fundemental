class SwitchCalculator{

public static void main(String args []){
java.util.Scanner sc= new java.util.Scanner(System.in);
     System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Which arithmetic would you like to calculate? ");
        String calculation=sc.next();

        switch (calculation) {
            case "+":
                System.out.println("The addition of these teo numbers are: " + (num1 + num2));
                break;
            case "-":
                System.out.println("The subtraction of these two numbers are: " + (num1 - num2));
                break;
            case "*":
                System.out.println("The multiplication of these two numbers are: " + (num1 * num2));
                break;
            case "/":
                System.out.println("The division of these two numbers are: " + (num1 / num2));
                break;
            case "%":
                System.out.println("The module of these two numbers are: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid calculation! ");
        }

        System.out.println("Enter 0 if you are done to calculation! ");
        System.out.println("Enter 1 if you calculate more numbers!");
        int n=sc.nextInt();
         if (n%2==1){
             System.out.println("Enter first number: ");
             int Num1 = sc.nextInt();
             System.out.println("Enter second number: ");
             int Num2 = sc.nextInt();
             System.out.println("Which arithmetic would you like to calculate? ");
             String Calculation=sc.next();

             switch (Calculation) {
                 case "+":
                     System.out.println("The addition of these teo numbers are: " + (Num1 + Num2));
                     break;
                 case "-":
                     System.out.println("The subtraction of these two numbers are: " + (Num1 - Num2));
                     break;
                 case "*":
                     System.out.println("The multiplication of these two numbers are: " + (Num1 * Num2));
                     break;
                 case "/":
                     System.out.println("The division of these two numbers are: " + (Num1 / Num2));
                     break;
                 case "%":
                     System.out.println("The module of these two numbers are: " + (Num1 % Num2));
                     break;
                 default:
                     System.out.println("Invalid calculation! ");
             }

             System.out.println("Enter 0 if you are done to calculation! ");
             System.out.println("Enter 1 if you calculate more numbers!");
         }
         else{
             System.out.println("Thank you for using this calculation! ");
         }

}
}