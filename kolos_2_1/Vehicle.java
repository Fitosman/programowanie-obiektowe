public class Vehicle {
    public String brand;
    public String model;
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public static class Car extends Vehicle {
        public int numberOfDoors;
        public Car(String brand, String model, int numberOfDoors) {
            super(brand, model);
            this.numberOfDoors = numberOfDoors;
        }
    }
}

