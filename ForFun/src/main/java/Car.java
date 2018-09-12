import java.math.BigDecimal;
import java.time.Year;

public class Car {
    private String carClass;

    private String brand;

    private String model;

    private Year releaseYear;

    private Enum color;

    private int power;

    private BigDecimal price;

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return carClass.equals(car.carClass)
                && brand.equals(car.brand)
                && model.equals(car.model)
                && releaseYear.equals(car.releaseYear)
                && color.equals(car.color)
                && power == car.power;
    }

    public int hashCode() {
        int result = carClass.hashCode();
        result = 13 * result + brand.hashCode();
        result = 13 * result + model.hashCode();
        result = 13 * result + releaseYear.hashCode();
        result = 13 * result + color.hashCode();
        result = 13 * result + Integer.hashCode(power);
        return result;
    }


}
