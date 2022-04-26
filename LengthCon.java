class LengthCon{
public static void main(String args[]){
java.util.Scanner sc= new java.util.Scanner(System.in);

     System.out.println("Enter value of length in inches: ");
        float inch=sc.nextFloat();

        float meter=inch/39.37f;
        System.out.println(inch+" inches convert into meter: "+meter+" meter");

        float cm=inch*2.54f;
        System.out.println(inch+" inches convert into centimeter: "+cm+" cm");

        float feet=inch/12;
        System.out.println(inch+" inches convert into feet: "+feet+" feet");
}
}