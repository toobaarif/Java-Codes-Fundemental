class CurrencyConversion{
public static void main(String args[]){
java.util.Scanner sc = new java.util.Scanner(System.in);

System.out.println("Enter currency in pkr: ");
float pkr=sc.nextFloat();

float dollar = pkr/167.2f;
float indianRupee = pkr/2.29f; 
float europe = pkr/198.71f;

System.out.println(pkr+" Rs in dollar = "+ dollar);
System.out.println(pkr+" Rs in indian rupees = "+ indianRupee);
System.out.println(pkr+" Rs in europe rupee = "+ europe);
}
}