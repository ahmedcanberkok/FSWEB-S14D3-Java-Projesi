package RDCompany.Main;

import RDCompany.Model.CarSkeleton;
import RDCompany.Model.ElectricCar;
import RDCompany.Model.HybridCar;

public class Main {
    public static void main(String[] args) {
        CarSkeleton tesla = new ElectricCar("Tesla","T3 Model",100,10);
        CarSkeleton mercedes = new HybridCar("Mercedes", "EQ Model",0.14,5,4);
       /* System.out.println("---------------");
         tesla.drive();
         mercedes.drive();
        */
        System.out.println("---------------");
        //Elektrikli Araç
        System.out.println(tesla.getName());
        System.out.println(tesla.startEngine());
        System.out.println(tesla.drive());

        System.out.println("---------------");

        //Hybrid Araç
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.drive());
        System.out.println("---------------");

    }
}
