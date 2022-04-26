class TaskOne{
public static void main (String args[]){
 
int a=10;
int b=20;
int c=a+b;


System.out.println("Sum of a and b: "+c);
a=c-a;
b=c-b;

System.out.println("The value of a which is change into value of b: "+a);
System.out.println("The value of b which is change into value of a: "+b);
}
}
