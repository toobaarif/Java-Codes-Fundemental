class TemperatureConverter{
public static void main(String [] args){
java.util.Scanner sc=new java.util.Scanner(System.in);

    System.out.println("Enter temperature in celsius: ");
        float celsius=sc.nextFloat();

        float fahrenheit=(celsius*9)/5+32;
        System.out.println(celsius+"°C temperature which is convert into fahrenheit: "+fahrenheit+"°F");

        float kelvin=celsius+273.15f;
        System.out.println(celsius+"°C temperature which is convert into kelvin: "+kelvin+"°K");
}
}