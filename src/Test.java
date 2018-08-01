public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Audi", 30, 6, false);
        vehicles[1] = new Truck("Man", 200, 10, false, 100);
        for (Vehicle veh : vehicles) {
            veh.info();
            System.out.println();
        }
        for (Vehicle vehicle : vehicles) {
            double zasieg=vehicle.obliczZasieg();
            System.out.println("zasięg z wyłączoną klimatyzacją: "+zasieg);

        }
        for (Vehicle vehicle : vehicles) {
            ((Car)vehicle).wlacz();
            System.out.println("zasięg z włączoną klimatyzacją: "+vehicle.obliczZasieg());
        }
    }
}