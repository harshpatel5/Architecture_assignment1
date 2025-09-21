public class BrandBFactory implements SmartDeviceFactory{

    @Override
    public SmartBulb createBulb() {
        return new BrandBBulb();
    }

    @Override
    public SmartLock createLock() {
        return new BrandBLock();
    }
}
