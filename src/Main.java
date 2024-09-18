import Objects.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Integer voltage, ampere;
    char plugType;
    boolean stop = false;

    while(!stop){
        System.out.println("1.Laptop");
        System.out.println("2.Refrigerator");
        System.out.println("3.Smartphone");
        System.out.println("4.Exit");
        System.out.print("Select Device:\n");
        int option = scan.nextInt();

        switch (option){
            case 1:
                System.out.println("Voltage: ");
                voltage = scan.nextInt();
                System.out.println("Ampere: ");
                ampere = scan.nextInt();
                System.out.println("Plug-type: ");
                plugType = scan.next().charAt(0);

                Laptop laptop = new Laptop(voltage,ampere,plugType);
                LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
                System.out.println(laptopAdapter.plugIn());
                break;
            case 2:
                System.out.println("Voltage: ");
                voltage = scan.nextInt();
                System.out.println("Ampere: ");
                ampere = scan.nextInt();
                System.out.println("Plug-type: ");
                plugType = scan.next().charAt(0);

                Refrigerator refrigerator = new Refrigerator(voltage,ampere,plugType);
                RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
                System.out.println(refrigeratorAdapter.plugIn());
                break;
            case 3:
                System.out.println("Voltage: ");
                voltage = scan.nextInt();
                System.out.println("Ampere: ");
                ampere = scan.nextInt();
                System.out.println("Plug-type: ");
                plugType = scan.next().charAt(0);

                SmartphoneCharger smartphoneCharger = new SmartphoneCharger(voltage,ampere,plugType);
                SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
                System.out.println(smartphoneAdapter.plugIn());
                break;
            case 4:
                stop = true;
                System.out.println("You have exited the app.");
                break;

            default:
                System.out.println("Invalid option");
        }


    }
            }
}
