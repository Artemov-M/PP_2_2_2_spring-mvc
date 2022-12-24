package web.model;


import java.time.LocalDate;

public class Car {

    String make;
    String model;
    LocalDate releaseDate;

    public Car(String make, String model, LocalDate releaseDate) {
        this.make = make;
        this.model = model;
        this.releaseDate = releaseDate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
