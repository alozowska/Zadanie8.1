public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Audi", 30, 6, false);
        vehicles[1] = new Truck("Man", 200, 10, false, 500);
        for (Vehicle veh : vehicles) {
            veh.info();
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                double zasiegCar = ((Car) vehicle).obliczZasiegCar();
                System.out.println("\nZasięg samochodu: " + zasiegCar);
            } else if (vehicle instanceof Truck) {
                double zasiegTruck = ((Truck) vehicle).obliczZasiegTruck();
                System.out.println("\nZasięg ciężarówki: " + zasiegTruck);
            }
        }
    }
}