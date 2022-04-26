class leapYear{
public static void main(String args[]){
java.util.Scanner sc = new java.util.Scanner (System.in);
System.out.println("Enter year in number: ");
int year = sc.nextInt();

if(year%4 ==0){
System.out.println("This is leap year! ");
}
else{
System.out.println("This is not a leap year! ");
}
}
}