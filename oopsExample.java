public class oopsExample {
    //base class

    class vehicle {
        private String brand;
        private String model;
        private int year;

        public vehicle(String brand, String model,int year){
            this.brand=brand;
            this.model=model;
            this.year=year;
        }


        public String displayInfo(){
            return year+" "+brand+model;
        }


    }

    class Car extends vehicle {
        //Inheritance
        private String fuelType;
        public Car(String brand, String model,int year, String fuelType){
            super(brand,model,year);
            this.fuelType=fuelType;
        }

        //Polymorphism
        public String displayInfo(){
            return super.displayInfo()+"Fuel"+fuelType;
        }

    }

// Ecapsulation
    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber,double balance){
            this.accountNumber=accountNumber;
            this.balance=balance;
        }

        public void deposit(double amount){
            balance = balance+amount;
            System.out.println("Deposited"+amount+"New balance"+balance);
        }
    }
    public static void main(String[] args) {

    }
}
