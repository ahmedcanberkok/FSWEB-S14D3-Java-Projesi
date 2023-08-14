package RDCompany.Model;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre ;
    private int cylinders;

    public GasPoweredCar(String name, String descripton, double avgKmPerLitre, int cylinders) {
        super(name, descripton);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "GasPoweredCar: Engine is starting";
    }

    @Override
    public String drive() {
        return "GasPoweredCar: Car is driving";
    }

}
