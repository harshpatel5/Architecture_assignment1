public class BrandBBulb implements SmartBulb{

    private int powerUsage;

    @Override
    public void setPowerUsage(int power) {
        this.powerUsage = power;
    }

    @Override
    public void showSpecs() {
        System.out.println("a Bulb from Brand B power usage: " + powerUsage + "W");
    }
}
