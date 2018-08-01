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

    public double obliczZasieg() {
        if (loading != 0) {
            if (isAirConditioning()) {
                return  getTank() / (getFuelConsumption() + 1.6 + loading * 0.5/100 )*100;
            } else {
                return getTank() / (getFuelConsumption() + loading * 0.5/100 )*100;
            }
        } else {
            if (isAirConditioning()) {
                return  getTank() / (getFuelConsumption() + 1.6)*100;
            } else {
                return  super.obliczZasieg();
            }
        }
    }
    public void info() {
        super.info();
        System.out.print(loading + " ");
    }
}