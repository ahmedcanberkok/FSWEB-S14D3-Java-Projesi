package PacificCarCompany.Model;

import java.util.Objects;

public class Car {
    private  boolean engine ;
    private int cylinders, wheels  ;
    private  String name ;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true ;
        this.wheels = 4 ;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        return getClass().getSimpleName() + " --- The car's engine is starting.";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " ---- The car is accelerating.";
    }

    public String brake() {
        return getClass().getSimpleName() + " ---- The car is braking.";
    }

    @Override

    // iyi bir java developer her zaman equals methodunu ezer !!
    public boolean equals(Object obj) {
        if (this == obj) {
            return  true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car =  (Car) obj ;

        return  engine == car.engine &&
                cylinders ==car.cylinders &&
                wheels == car.wheels &&
                Objects.equals(name,car.name) ;
    }

    @Override

    public String toString() {
        return "Car =>> " + " engine : " + engine +
                " cylinders : " + cylinders +
                " name : " + getName() +
                " wheels : " + wheels ;
    }
}
