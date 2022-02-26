package SF.Collection.Car2;


import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private Boolean onSale;

    public Car(String brand, String model, Boolean onSale) {
        if (brand == null || model == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.model = model;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", onSale=" + onSale +
               '}';
    }
}

