package RDCompany.Model;

public class CarSkeleton {

    private String name, descripton ;

    public CarSkeleton(String name, String descripton) {
        this.name = name;
        this.descripton = descripton;
    }

    public String getName() {
        return name;
    }

    public String getDescripton() {
        return descripton;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " CarSkeloton =>> Engine is starting...";
    }

    public String drive() {
        runEngine(this) ;
        return getClass().getSimpleName() + " CarSkeloton =>> Car is driving...";
    }
    protected void runEngine(CarSkeleton carSkeleton) {
        if ( carSkeleton instanceof GasPoweredCar) {
            System.out.println("GasPoweredCar engine started...");
        } else if (carSkeleton instanceof ElectricCar) {
            System.out.println("ElectricCar engine started...");

        } else if (carSkeleton instanceof  HybridCar) {
            System.out.println("HybridCar engine started...");


        }

    }


}
