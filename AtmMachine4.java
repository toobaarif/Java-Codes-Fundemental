class AtmMachine4{
public static void main(String args[]){
java.util.Scanner sc = new java.util.Scanner(System.in);

               //Program of ATM machine
        System.out.println("Enter amount in rupees: ");
        int amount=sc.nextInt();

        System.out.println("Number of 5000 in amount: "+amount/5000);

        System.out.println("Number of 1000 in amount: "+(amount%5000)/1000);

        System.out.println("Number of 500 in amount: "+((amount%5000)%1000)/500);

        System.out.println("Number of 100 in amount: "+(((amount%5000)%1000)%500)/100);

        System.out.println("Number of 50 in amount: "+((((amount%5000)%1000)%500)%100)/50);

        System.out.println("Number of 20 in amount: "+(((((amount%5000)%1000)%500)%100)%50)/20);

        System.out.println("Number of 10 in amount: "+((((((amount%5000)%1000)%500)%100)%50)%20)/10);

        System.out.println("Number of 5 in amount: "+(((((((amount%5000)%1000)%500)%100)%50)%20)%10)/5);

        System.out.println("Number of 2 in amount: "+((((((((amount%5000)%1000)%500)%100)%50)%20)%10)%5)/2);

        System.out.println("Number of 1 in amount: "+(((((((((amount%5000)%1000)%500)%100)%50)%20)%10)%5)%2)/1);
}
}