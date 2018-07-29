public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, double tank, double fuelConsumption, boolean airConditioning) {
        super(name, tank, fuelConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public void wlacz() {
        airConditioning = true;
    }

    public void wylacz() {
        airConditioning = false;
    }

    public double obliczZasiegCar() {
        double zasieg = 0;
        if (airConditioning == true) {
            return zasieg = (getTank() / (getFuelConsumption() + 0.8))*100;
        } else if (airConditioning == false) {
            return zasieg = (getTank() / getFuelConsumption())*100;
        }
        return zasieg;
    }

    public void info() {
        super.info();
        System.out.print(airConditioning+" ");
    }
}
