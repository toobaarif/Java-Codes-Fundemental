
class TruckEarning3{

public static void main (String args []){
java.util.Scanner sc= new java.util.Scanner(System.in);

 System.out.println("Enter the number of trucks: ");
int numOfTruck=sc.nextInt();

int tEarning=3000;
System.out.println("Earning of per truck: "+tEarning);

int driver=1000;
int diesel=500;
int tax=100;
int expenses=driver+diesel+tax;

System.out.println("Total expenses from 3000 earning: "+expenses);
int profit= tEarning-expenses;
System.out.println("Profit of the truck earning: "+profit);

int totalTruckProfit=profit*numOfTruck;
   System.out.println("Profit of all trucks: "+totalTruckProfit);
}
}
