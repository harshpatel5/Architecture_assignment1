public class BrandALock implements SmartLock{

    private int batteryUsage;

    @Override
    public void setBatteryUsage(int battery) {
        this.batteryUsage = battery;
    }

    @Override
    public void showSpecs() {
        System.out.println("A Lock from Brand A battery usage: " + batteryUsage + "%");
    }
}
