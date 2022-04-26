class Ages{
public static void main(String args[]){

java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter firs age: ");
        int age1 = sc.nextInt();
        System.out.println("Enter second age: ");
        int age2= sc.nextInt();
        System.out.println("Enter third age: ");
        int age3= sc.nextInt();
        if (age1 >= age2 && age1 >= age3){
            System.out.println(age1+" is greater");
        }
        else if (age2 >= age1 && age2 >=age3){
            System.out.println(age2+" is greater");
        }
        else if (age3 >=age1 && age3 >= age2){
            System.out.println(age3+" is greater");
        }
        else {
           System.out.println("Invalid error!");

        }
    }

}

