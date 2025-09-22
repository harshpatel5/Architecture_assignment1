Smart Home Simulator
====================

A simple Java project that simulates smart home devices (smart bulbs and smart locks) using the Abstract Factory Method design pattern.
Device usage data is read from text files and displayed in the console.

Features
--------
- Create smart bulbs and locks from different brands
- Read power/battery usage from external files (bulb.txt, lock.txt)
- Display device specifications in the console
- Demonstrates the Abstract Factory Pattern in Java

Project Structure
-----------------
SmartHomeSimulator/
├── src/
│   ├── SmartDeviceFactory.java     # Interface (createBulb, createLock)
│   ├── SmartBulb.java              # Interface (setPowerUsage, showSpecs)
│   ├── SmartLock.java              # Interface (setBatteryUsage, showSpecs)
│   ├── BrandABulb.java             # Brand A implementation of SmartBulb
│   ├── BrandALock.java             # Brand A implementation of SmartLock
│   ├── BrandAFactory.java          # Factory that creates Brand A devices
│   ├── BrandBBulb.java             # Brand B implementation of SmartBulb
│   ├── BrandBLock.java             # Brand B implementation of SmartLock
│   ├── BrandBFactory.java          # Factory that creates Brand B devices
│   └── TestDriver.java             # Demonstration driver
├── bulb.txt
├── lock.txt
└── README.txt

Example Input
-------------
bulb.txt
69

lock.txt
69

Screenshots
-----------
![Program Output](screenshots/output.png)

How to Run
----------
1. Clone the repo:
   git clone https://github.com/harshpatel5/Architecture_assignment1.git
   cd Architecture_assignment1

2. Compile the Java files:
   javac src/*.java

3. Run the program:
   java -cp src TestDriver

Concepts Covered
----------------
- Java OOP
- File handling (Scanner, File)
- Abstract Factory Design Pattern
