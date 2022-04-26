 class Bus {
    String brandName;
    int priceNew;
    String color;
    int odometer;

//        public Car(String brandName, int priceNew, String color, int odometer){
//            this.brandName = brandName;
//            this.priceNew = priceNew;
//            this.color = color;
//            this.odometer = odometer;
//        }

    public int getPriceAfter() {
        int afterUse = priceNew * (1 - odometer);
        return afterUse;
    }

    public int updateMileage() {
        int mileage = odometer * 2;
        return mileage;
    }

    public void outputDetail() {
        System.out.println("Brand of car is: " + brandName);
        System.out.println("Price of new car: " + priceNew);
        System.out.println("Price of used car: " + getPriceAfter());
        System.out.println("Color of car is: " + color);
        System.out.println("Odometer of car is: " + odometer);
    }

    public static void main(String[] args) {
        Bus obj = new Bus();
        System.out.println(obj.getPriceAfter());
    }
}


