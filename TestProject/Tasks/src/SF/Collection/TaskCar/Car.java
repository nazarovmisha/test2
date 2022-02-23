package SF.Collection.TaskCar;

public class Car {
    private String brand;
    private String model;
    private Boolean onSale;

    public Car(String brand, String model, Boolean onSale) {
        this.brand = brand;
        this.model = model;
        this.onSale = onSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    public String toString(){
        return "Car{" + "brand =' " + brand + '\''+
               ", model" + model + '\'' +
               ", on sale" + onSale +
               "}";

    }
}
