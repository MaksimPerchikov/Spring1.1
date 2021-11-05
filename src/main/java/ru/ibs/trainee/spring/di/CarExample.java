package ru.ibs.trainee.spring.di;

public class CarExample {
    public static void main(String[] args) {
        Car badCar = new BadCarImpl();
        badCar.drive();

        Car goodCar = new GoodCarImpl(new PetrolEngineImpl());
        goodCar.drive();

        goodCar.setEngine();
    }
}
