package RDCompany.Model;

public class HybridCar extends CarSkeleton{
  private double avgKmPerLitre ;
  private  int batterySize ;
  private  int cylinders ;

    public HybridCar(String name, String descripton, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, descripton);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "HybridCar: Engine is starting";
    }

    @Override
    public String drive() {
        return "HybridCar: Car is driving";
    }
}
