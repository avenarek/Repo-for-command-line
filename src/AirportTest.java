import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        AirportTest airportTest = new AirportTest();
        Plane[] planes = airportTest.create(3);

        System.out.println("All planes:");
        for (Plane plane : planes) {
            planeService.task1(plane);
        }

        System.out.println("Task 1:");
        planeService.task1(planes[0]);
        System.out.println("Task 2:");
        planeService.task2(planes[1]);
        System.out.println("Task 3:");
        planeService.task1(planeService.task3(planes[0], planes[2]));
        System.out.println("Task 4:");
        planeService.task1(planeService.task4(planes[1], planes[0]));
        System.out.println("Task 5:");
        planeService.task5(planes[0], planes[1], planes[2]);
        System.out.println("Task 6:");
        planeService.task6(planes);
        System.out.println("Task 7:");
        planeService.task7(planes);
        System.out.println("Task 8:");
        planeService.task1(planeService.task8(planes));
        System.out.println("Task 9:");
        planeService.task1(planeService.task9(planes));
        System.out.println("Task 10:");
        planeService.task10(planes);
    }

    public Plane[] create(int count) {
        Plane[] planes = new Plane[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the properties for Plane " + i);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the model");
            String model = scanner.next();
            System.out.println("Enter the country");
            String country = scanner.next();
            System.out.println("Enter the year");
            int year = scanner.nextInt();
            System.out.println("Enter the hours");
            int hours = scanner.nextInt();
            System.out.println("Enter the isMilitary");
            boolean isMilitary = scanner.nextBoolean();
            System.out.println("Enter the weight");
            int weight = scanner.nextInt();
            System.out.println("Enter the wingspan");
            int wingspan = scanner.nextInt();
            System.out.println("Enter the topSpeed");
            int topSpeed = scanner.nextInt();
            System.out.println("Enter the seats");
            int seats = scanner.nextInt();
            System.out.println("Enter the cost");
            double cost = scanner.nextDouble();
            System.out.println("--------------------------");

            planes[i] = new Plane(model, country, year, hours, isMilitary, weight, wingspan, topSpeed, seats, cost);
        }
        return planes;
    }

}

