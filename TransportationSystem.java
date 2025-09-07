import java.util.Scanner;

abstract class Transport {
    abstract void start();
    abstract void stop();
}

class Car extends Transport {
    public void start() {
        System.out.println("Car starts with ignition key");
    }
    public void stop() {
        System.out.println("Car stops with brakes");
    }
}

class Bike extends Transport {
    public void start() {
        System.out.println("Bike starts with self start or kick");
    }
    public void stop() {
        System.out.println("Bike stops with hand and foot brakes");
    }
}

class Bus extends Transport {
    public void start() {
        System.out.println("Bus starts with heavy engine");
    }
    public void stop() {
        System.out.println("Bus stops using air brakes");
    }
}

public class TransportationSystem {
    public static void main(String[] args) {
        Transport[] vehicles = { new Car(), new Bike(), new Bus() };
        Scanner sc = new Scanner(System.in);
        int choice;
        char input;
        do {
            System.out.println("Select Your Transport:");
            System.out.println("Enter 1 : Car");
            System.out.println("Enter 2 : Bike");
            System.out.println("Enter 3 : Bus");
            System.out.println("Enter 0 : to exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Start");
                        System.out.println("Enter 2 : Stop");
                        switch (sc.nextInt()) {
                            case 1:
                                vehicles[0].start();
                                break;
                            case 2:
                                vehicles[0].stop();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');
                    break;
                case 2:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Start");
                        System.out.println("Enter 2 : Stop");
                        switch (sc.nextInt()) {
                            case 1:
                                vehicles[1].start();
                                break;
                            case 2:
                                vehicles[1].stop();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');
                    break;
                case 3:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Start");
                        System.out.println("Enter 2 : Stop");
                        switch (sc.nextInt()) {
                            case 1:
                                vehicles[2].start();
                                break;
                            case 2:
                                vehicles[2].stop();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');
                    break;
                case 0:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        } while (choice != 0);
    }
}
