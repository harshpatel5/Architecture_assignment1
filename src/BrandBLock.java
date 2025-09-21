public class BrandBLock implements SmartLock{

    private int batteryUsage;

    @Override
    public void setBatteryUsage(int battery) {
        this.batteryUsage = battery;
    }

    @Override
    public void showSpecs() {
        System.out.println("a Lock from Brand B battery usage: " + batteryUsage + " %");
    }
}
