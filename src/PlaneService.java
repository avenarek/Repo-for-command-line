public class PlaneService {

    public void task1(Plane p1) {

        System.out.println("Plane{" +
                "model='" + p1.getModel() + '\'' +
                ", country='" + p1.getCountry() + '\'' +
                ", year=" + p1.getYear() +
                ", hours=" + p1.getHours() +
                ", isMilitary=" + p1.isMilitary() +
                ", weight=" + p1.getWeight() +
                ", wingspan=" + p1.getWingspan() +
                ", topSpeed=" + p1.getTopSpeed() +
                ", seats=" + p1.getSeats() +
                ", cost=" + p1.getCost() +
                '}');

    }

    public void task2(Plane p1) {

        if (p1.isMilitary()) {

            System.out.println(p1.getCost());
            System.out.println(p1.getTopSpeed());

        } else {
            System.out.println(p1.getModel());
            System.out.println(p1.getCountry());
        }

    }

    public Plane task3(Plane p1, Plane p2) {
        if (p1.getYear() > p1.getYear()) {
            return p1;
        } else if (p1.getYear() < p2.getYear()) {
            return p2;
        } else {
            return p1;
        }
    }

    public Plane task4(Plane p1, Plane p2) {

        if (p1.getWingspan() > p2.getWingspan()) {
            return p1;
        } else if (p1.getWingspan() < p2.getWingspan()) {
            return p2;
        } else {
            return p2;
        }

    }

    public void task5(Plane p1, Plane p2, Plane p3) {

        if (p1.getSeats() < p2.getSeats() && p1.getSeats() < p3.getSeats()) {
            System.out.println(p1.getCountry());
        } else if (p2.getSeats() < p3.getSeats()) {
            System.out.println(p2.getCountry());
        } else {
            System.out.println(p3.getCountry());
        }

    }

    public void task6(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                task1(plane);
            }
        }
    }

    public void task7(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary()) {
                if (plane.getHours() > 100) {
                    task1(plane);
                }
            }
        }
    }

    public Plane task8(Plane[] planes) {
        int indexOfMinWeight = 0;
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= planes[indexOfMinWeight].getWeight()) {
                indexOfMinWeight = i;
            }
        }
        return planes[indexOfMinWeight];
    }

    public Plane task9(Plane[] planes) {
        int indexOfMinCost = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getCost() < planes[indexOfMinCost].getCost()) {
                indexOfMinCost = i;
            }
        }
        return planes[indexOfMinCost];
    }

    public void task10(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j - 1].getYear() > planes[j].getYear()) {
                    Plane temp = planes[j - 1];
                    planes[j - 1] = planes[j];
                    planes[j] = temp;
                }
            }
        }
        for (Plane plane : planes) {
            task1(plane);
        }
    }
}
