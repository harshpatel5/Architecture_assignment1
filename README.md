# Assignment 1  – Design Patterns 

This project demonstrates the *Abstract Factory* and *Factory Method* design patterns by creating brand-specific smart home devices (Smart Bulb and Smart Lock)

---
##  Repository Structure

- src/  
  - BrandABulb.java — Brand A implementation of Smarbulb
  - BrandALock.java — Brand A implementation of SmartLock 
  - BrandAFactory.java — Factory that creates Brand A devices  
  - BrandBBulb.java — Brand B implementation of SmartBulb  
  - BrandBLock.java — Brand B implementation of SmartLock  
  - BrandBFactory.java — Factory that creates Brand B devices  
  - SmartBulb.java — SmartBulb interface (setPowerUsage, showSpecs)  
  - SmartLock.java — SmartLock interface (setBatteryUsage, showSpecs)  
  - SmartDeviceFactory.java — SmartDeviceFactory interface (createBulb, createLock)  
  - Main.java — 
  - TestDriver.java — Test driver that demonstrates:  
    - Creating a Bulb from Brand A and setting power usage from bulb.txt  
    - Creating a Lock from Brand B and setting battery usage from lock.txt  
- bulb.txt 
- lock.txt

- README.md 
---
##  TestDriver.java 

The TestDriver class demonstrates how the factories and the products work together

1. The TestDriver class first ensures the current working directory to ensure correct file paths 

2.  The TestDriver class then reads from the text files bulb.txt and lock.txt


![Ensuring working directory](https://photos.app.goo.gl/1qbnKSnnGAXTZnu48)

