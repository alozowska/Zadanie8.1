public class Truck extends Car {
    private double loading;

    public Truck(String name, double tank, double fuelConsumption, boolean airConditioning, double loading) {
        super(name, tank, fuelConsumption, airConditioning);
        this.loading = loading;
    }

    public double getLoading() {
        return loading;
    }

    public void setLoading(double loading) {
        this.loading = loading;
    }

    public double obliczZasiegTruck() {
        double zasieg = 0;
        if (loading != 0) {
            if (isAirConditioning() == true) {
                return zasieg = getTank() / (getFuelConsumption() + 1.6 + loading * 0.5 / 100);
            } else {
                return zasieg = getTank() / (getFuelConsumption() + loading * 0.5 / 100);
            }
        } else {
            if (isAirConditioning() == true) {
                return zasieg = getTank() / (getFuelConsumption() + 1.6);
            } else {
                return zasieg = getTank() / getFuelConsumption();
            }
        }
    }
    public void info() {
        super.info();
        System.out.print(loading + " ");
    }
}