public class BrandABulb implements  SmartBulb{

    private int powerUsage;

    @Override
    public void setPowerUsage(int power) {
        this.powerUsage = power;
    }

    @Override
    public void showSpecs() {
        System.out.println("A Bulb from Brand A power usage: " + powerUsage + " W");
    }
}
