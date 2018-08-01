public class Vehicle {
    private String name;
    private double tank;
    private double fuelConsumption;

    public Vehicle(String name, double tank, double fuelConsumption) {
        this.name = name;
        this.tank = tank;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public double obliczZasieg(){
        return tank/fuelConsumption*100;
    }
    public void info(){
        System.out.print(name+ " "+tank+" "+fuelConsumption+" ");
    }
}
