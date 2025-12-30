public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Umida Gaipova", "UMI704");
        Driver driver2 = new Driver("Sevara Gaipova", "SEV402");

        Vehicle car = new Car("Toyota", 2022, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Hyundai", 2021, false);
        Vehicle truck = new Truck("Volvo", 2020, 12.5, 6);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }

            v.stopEngine();
            System.out.println(".......................");
        }
    }
}
