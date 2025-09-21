import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {

        System.out.println("Working dir: " + System.getProperty("user.dir"));
        System.out.println("-----------------------------------------------");
        System.out.println("Printing 2 examples and reading values from files");
        System.out.println("-----------------------------------------------");


        try {
            //brand A bulb
            SmartDeviceFactory brandAFactory = new BrandAFactory();
            SmartBulb bulbA = brandAFactory.createBulb();

            //SmartDeviceFactory brandBFactory1 = new BrandBFactory();
            //SmartBulb bulbB = brandBFactory1.createBulb();

            //reading from the text file
            Scanner bulbScanner = new Scanner(new File("bulb.txt"));
            int bulbUsage = bulbScanner.nextInt();  // read one value
            bulbA.setPowerUsage(bulbUsage);
            //bulbB.setPowerUsage(bulbUsage);
            bulbScanner.close();

            bulbA.showSpecs();
            //bulbB.showSpecs();


           //brand b lock
            SmartDeviceFactory brandBFactory = new BrandBFactory();
            SmartLock lockB = brandBFactory.createLock();

            // reading from the text file
            Scanner lockScanner = new Scanner(new File("lock.txt"));
            int lockUsage = lockScanner.nextInt();  // read one value
            lockB.setBatteryUsage(lockUsage);
            lockScanner.close();

            lockB.showSpecs();

        } catch (FileNotFoundException e) {
            System.out.println("Error: data file is missing....");
        }
    }
}
