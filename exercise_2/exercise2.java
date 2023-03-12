//import scanner
import java.io.*;
import java.util.Scanner;

class Kilometraza{
public static void main(String[]args) throws InterruptedException {
    // Enter kilometers, convert and store them as decimal number
    Scanner kilometer = new Scanner(System.in);
    System.out.println("Enter kilometers in decimal:");
    double decimalKilometer = kilometer.nextDouble();
    System.out.println("\n" + "Your number is set to decimal point " + decimalKilometer);
    if (decimalKilometer <= 0) {
        System.out.println("\n" + "Warning, number is negative.");
    }
    // Sleep module
    Thread.sleep(1500);

    //Enter conversion factor, convert and store it as decimal number
    Scanner conversionFactor = new Scanner(System.in);
    System.out.println("\n" + "Enter conversion factor in decimal: ");
    double decimalFactor = conversionFactor.nextDouble();
    System.out.println("\n" + "Your number is set to decimal point " + decimalFactor);
    if (decimalFactor <= 0) {
        System.out.println("\n" + "Warning, number is negative.");
    }

    // convert kilometers to miles
    int convert = (int) (decimalKilometer / decimalFactor);

    if (convert <= 0) {
        System.out.println("\n" + "Your number is negative, try again!");
    }

    // Write factor from user input in txt file
    String filePath = "conversion_factor.txt";
    try {
        FileWriter writer = new FileWriter(filePath);
        writer.write(Double.toString(decimalFactor));
        writer.close();
    } catch (IOException e) {
        System.out.println("\n" + "An error occurred.");
    }

    // read factor from file
    String line = "";
    try {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        line = reader.readLine();
        System.out.println("Reading from file...");
        Thread.sleep(1500);
        System.out.println("\n" + "Conversion factor in file is: " + line);
        reader.close();

    } catch (IOException e) {
        System.out.println("\n" + "An error occurred.");
    }

    //Get data from file and check if the factor from user input is the same as in the file
    System.out.println("calculating...");
    Thread.sleep(3000);
    double factorFromFile = Double.parseDouble(line);
    if (decimalFactor == factorFromFile)
    {
        System.out.println("\n" + "It's entered " + decimalKilometer + " kilometers, which is " + convert + " miles");
    }
}
}