public class Plane {
    private String model = "model";
    private String country = "country";
    private int year = 1903;
    private int hours = 0;
    private boolean isMilitary = false;
    private int weight = 1000;
    private int wingspan = 10;
    private int topSpeed = 1000;
    private int seats = 1;
    private double cost = 1;

    public Plane(String model, String country, int year, int hours, boolean isMilitary,
                 int weight, int wingspan, int topSpeed, int seats, double cost) {
        setModel(model);
        setCountry(country);
        setYear(year);
        setHours(hours);
        setMilitary(isMilitary);
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty()) {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1903 && year < 2021) {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0 && hours < 1000) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 1000 && weight < 160000) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan > 10 && wingspan < 45) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0 && topSpeed < 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 0) {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }
}
