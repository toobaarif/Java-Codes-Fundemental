class Conversion{
public static void main(String args[]){
java.util.Scanner sc= new java.util.Scanner(System.in);

    System.out.println("Enter value in gram: ");
        float gram=sc.nextFloat();

        float kg=(gram/1000);
        System.out.println(gram+" gram convert into kilogram: "+kg+"kg");

        float pounds=(gram/454);
        System.out.println(gram+" gram convert into pounds: "+pounds+" pounds");

        float milligram=gram*1000;
        System.out.println(gram+" gram convert into milligram: "+milligram+" milligram");
}
}